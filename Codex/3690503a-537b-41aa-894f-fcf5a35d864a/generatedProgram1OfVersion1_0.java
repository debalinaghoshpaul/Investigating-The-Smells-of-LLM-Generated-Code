class Vehicle {
    public void startEngine() {
        // Base implementation for starting the engine
        System.out.println("Engine started");
    }

    public void stopEngine() {
        // Base implementation for stopping the engine
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        // Implementation specific to starting a car engine
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        // Implementation specific to stopping a car engine
        System.out.println("Car engine stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        // Implementation specific to starting a motorcycle engine
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        // Implementation specific to stopping a motorcycle engine
        System.out.println("Motorcycle engine stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Motorcycle();

        vehicle1.startEngine();
        vehicle1.stopEngine();

        vehicle2.startEngine();
        vehicle2.stopEngine();
    }
}