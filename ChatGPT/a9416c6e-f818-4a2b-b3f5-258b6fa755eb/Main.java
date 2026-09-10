// Vehicle.java
// Parent class Vehicle
class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}
// Car.java
// Child class Car
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
// Main.java
// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive(); // Output: Repairing a vehicle
        car.drive(); // Output: Repairing a car
    }
}
