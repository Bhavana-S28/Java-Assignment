
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = new Car[]{
            new Car(1, "Toyota", "Corolla", 2015, "Red", 15000.0, "XYZ123"),
            new Car(2, "Honda", "Civic", 2018, "Blue", 20000.0, "ABC456"),
            new Car(3, "Ford", "Mustang", 2013, "Black", 25000.0, "DEF789"),
            new Car(4, "Toyota", "Camry", 2016, "White", 18000.0, "GHI012"),
            new Car(5, "Honda", "Accord", 2020, "Gray", 22000.0, "JKL345")
        };

        // Example usage
        saveCarsByMake(cars, "Toyota");
        saveCarsByModelAndAge(cars, "Civic", 5);
        saveCarsByYearAndPrice(cars, 2015, 18000.0);
    }

    public static void saveCarsByMake(Car[] cars, String make) {
    List<Car> filteredCars = new ArrayList<>();
    for (Car car : cars) {
        if (car.getMake().equalsIgnoreCase(make)) {
            filteredCars.add(car);
        }
    }
    writeToFile(filteredCars, "cars_by_make_" + make + ".txt");
}

public static void saveCarsByModelAndAge(Car[] cars, String model, int n) {
    List<Car> filteredCars = new ArrayList<>();
    int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    for (Car car : cars) {
        if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYearOfManufacture() > n)) {
            filteredCars.add(car);
        }
    }
    writeToFile(filteredCars, "cars_by_model_age_" + model + ".txt");
}

public static void saveCarsByYearAndPrice(Car[] cars, int year, double price) {
    List<Car> filteredCars = new ArrayList<>();
    for (Car car : cars) {
        if (car.getYearOfManufacture() == year && car.getPrice() > price) {
            filteredCars.add(car);
        }
    }
    writeToFile(filteredCars, "cars_by_year_price_" + year + ".txt");
}

private static void writeToFile(List<Car> cars, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        for (Car car : cars) {
            writer.write(car.toString());
            writer.newLine();
        }
    } catch (IOException e) {
    }
}

}
