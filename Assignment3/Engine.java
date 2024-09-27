// Engine.java
abstract class Engine {
    protected String type;

    public abstract String getType();
}

// CombustionEngine.java
class CombustionEngine extends Engine {
    public CombustionEngine() {
        this.type = "Combustion Engine";
    }

    @Override
    public String getType() {
        return type;
    }
}

// ElectricEngine.java
class ElectricEngine extends Engine {
    public ElectricEngine() {
        this.type = "Electric Engine";
    }

    @Override
    public String getType() {
        return type;
    }
}

// HybridEngine.java
class HybridEngine extends Engine {
    public HybridEngine() {
        this.type = "Hybrid Engine";
    }

    @Override
    public String getType() {
        return type;
    }
}
