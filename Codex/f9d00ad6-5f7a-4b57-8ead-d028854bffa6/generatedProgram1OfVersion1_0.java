class Vehicle {
    // Common properties and methods for all vehicles

    public void speedUp() {
        // Implementation for increasing speed in the base class
    }
}

class Car extends Vehicle {
    @Override
    public void speedUp() {
        // Implementation for increasing speed in the Car subclass
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        // Implementation for increasing speed in the Bicycle subclass
    }
}