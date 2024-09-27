
public class Car {
    private final int id;
    private final String make;
    private final String model;
    private final int yearOfManufacture;
    private final String color;
    private final double price;
    private final String registrationNumber;

    // Constructor
    public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }



    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    // Override toString for easy output
    @Override
    public String toString() {
        return String.format("ID: %d, Make: %s, Model: %s, Year: %d, Color: %s, Price: %.2f, Registration: %s",
                id, make, model, yearOfManufacture, color, price, registrationNumber);
    }
}
