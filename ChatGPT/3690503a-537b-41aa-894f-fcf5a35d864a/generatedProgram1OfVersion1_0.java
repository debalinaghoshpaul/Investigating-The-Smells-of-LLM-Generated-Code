// Vehicle.java
// Parent class Vehicle

public abstract class Vehicle {

    public void startEngine() {
        System.out.println("Vehicle engine started");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}

// Car.java
// Child class Car

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped with a key");
    }
}

// Motorcycle.java
// Child class Motorcycle

public class Motorcycle extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped with a kickstand");
    }
}

// Main.java
// Main class

public class Main {

    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();

        // Start and stop the car engine
        car.startEngine();
        car.stopEngine();

        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle();

        // Start and stop the motorcycle engine
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
