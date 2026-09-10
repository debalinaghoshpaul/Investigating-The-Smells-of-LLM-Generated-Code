// Vehicle class
class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Getters and setters for make, model, year, and fuelType

    // Method to calculate fuel efficiency
    public double calculateFuelEfficiency() {
        // Add your code here
    }

    // Method to calculate distance traveled
    public double calculateDistanceTraveled(double fuelEfficiency, double fuelConsumed) {
        // Add your code here
    }

    // Method to get maximum speed
    public int getMaximumSpeed() {
        // Add your code here
    }
}

// Truck class
class Truck extends Vehicle {
    // Add additional properties specific to Truck class

    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Add additional methods specific to Truck class
}

// Car class
class Car extends Vehicle {
    // Add additional properties specific to Car class

    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Add additional methods specific to Car class
}

// Motorcycle class
class Motorcycle extends Vehicle {
    // Add additional properties specific to Motorcycle class

    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    // Add additional methods specific to Motorcycle class
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects of Truck, Car, and Motorcycle classes
        Truck truck = new Truck("Ford", "F-150", 2022, "Diesel");
        Car car = new Car("Toyota", "Camry", 2022, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2022, "Gasoline");

        // Perform operations on the objects
        double truckFuelEfficiency = truck.calculateFuelEfficiency();
        double carFuelEfficiency = car.calculateFuelEfficiency();
        double motorcycleFuelEfficiency = motorcycle.calculateFuelEfficiency();

        double truckDistanceTraveled = truck.calculateDistanceTraveled(truckFuelEfficiency, 100);
        double carDistanceTraveled = car.calculateDistanceTraveled(carFuelEfficiency, 100);
        double motorcycleDistanceTraveled = motorcycle.calculateDistanceTraveled(motorcycleFuelEfficiency, 100);

        int truckMaximumSpeed = truck.getMaximumSpeed();
        int carMaximumSpeed = car.getMaximumSpeed();
        int motorcycleMaximumSpeed = motorcycle.getMaximumSpeed();

        // Print the results
        System.out.println("Truck distance traveled: " + truckDistanceTraveled);
        System.out.println("Car distance traveled: " + carDistanceTraveled);
        System.out.println("Motorcycle distance traveled: " + motorcycleDistanceTraveled);

        System.out.println("Truck maximum speed: " + truckMaximumSpeed);
        System.out.println("Car maximum speed: " + carMaximumSpeed);
        System.out.println("Motorcycle maximum speed: " + motorcycleMaximumSpeed);
    }
}