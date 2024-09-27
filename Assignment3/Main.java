// Main.java
public class Main {
    public static void main(String[] args) {
        // Create Manufacture objects
        Manufacture toyota = new Manufacture();
        toyota.setName("Toyota");
        toyota.setLocation("Japan");

        Manufacture tesla = new Manufacture();
        tesla.setName("Tesla");
        tesla.setLocation("USA");

        Manufacture honda = new Manufacture();
        honda.setName("Honda");
        honda.setLocation("Japan");

        // Create Engine objects
        Engine combustionEngine = new CombustionEngine();
        Engine electricEngine = new ElectricEngine();
        Engine hybridEngine = new HybridEngine();

        // Create Vehicle objects
        Vehicle[] vehicles = new Vehicle[]{
            new ICEV(toyota, combustionEngine),
            new BEV(tesla, electricEngine),
            new HybridV(honda, hybridEngine)
        };

        // Show characteristics
        for (Vehicle vehicle : vehicles) {
            vehicle.showCharacteristics();
            System.out.println();
        }
    }
}
