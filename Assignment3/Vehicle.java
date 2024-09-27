// Vehicle.java
abstract class Vehicle {
    protected Manufacture manufacture;
    protected Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void showCharacteristics();
}

// ICEV.java
class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("ICE Vehicle Characteristics:");
        System.out.println("Manufacturer: " + manufacture.getName() + ", Location: " + manufacture.getLocation());
        System.out.println("Engine Type: " + engine.getType());
    }
}

// BEV.java
class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("BEV Characteristics:");
        System.out.println("Manufacturer: " + manufacture.getName() + ", Location: " + manufacture.getLocation());
        System.out.println("Engine Type: " + engine.getType());
    }
}

// HybridV.java
class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Hybrid Vehicle Characteristics:");
        System.out.println("Manufacturer: " + manufacture.getName() + ", Location: " + manufacture.getLocation());
        System.out.println("Engine Type: " + engine.getType());
    }
}
