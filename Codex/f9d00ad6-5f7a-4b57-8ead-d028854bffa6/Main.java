// Vehicle.java
// Base class Vehicle

class Vehicle {
    private int speed;

    public void speedUp() {
        speed += 10;
    }

    public int getSpeed() {
        return speed;
    }
}

// Car.java
// Subclass Car

class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 units.");
    }
} 
// Motorcycle.java
// Subclass Motorcycle

class Motorcycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speed increased by 12 units");
    }
}
// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());
        car.speedUp();
        motorcycle.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());
    }
}
