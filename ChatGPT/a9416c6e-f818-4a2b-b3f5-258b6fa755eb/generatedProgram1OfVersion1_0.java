// Vehicle.java
public class Vehicle {
    public void drive() {
        System.out.println("Driving...");
    }
}

// Car.java
public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing...");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive(); // Output: Driving...

        Car car = new Car();
        car.drive(); // Output: Repairing...
    }
}
