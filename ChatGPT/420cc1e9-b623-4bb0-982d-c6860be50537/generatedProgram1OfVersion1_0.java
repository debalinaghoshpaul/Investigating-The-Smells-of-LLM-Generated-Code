// Vehicle.java
// Parent class Vehicle

public abstract class Vehicle {
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

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double calculateMaximumSpeed();
}

// Truck.java
// Child class Truck

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Calculate fuel efficiency based on cargo capacity
        return 10.0 / (cargoCapacity + 1);
    }

    @Override
    public double calculateDistanceTraveled() {
        // Calculate distance traveled based on fuel efficiency
        return calculateFuelEfficiency() * 100;
    }

    @Override
    public double calculateMaximumSpeed() {
        // Calculate maximum speed based on truck type
        return 80.0;
    }
}

// Car.java
// Child class Car

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String make, String model, int year, String fuelType, int numberOfSeats) {
        super(make, model, year, fuelType);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Calculate fuel efficiency based on number of seats
        return 20.0 / (numberOfSeats + 1);
    }

    @Override
    public double calculateDistanceTraveled() {
        // Calculate distance traveled based on fuel efficiency
        return calculateFuelEfficiency() * 100;
    }

    @Override
    public double calculateMaximumSpeed() {
        // Calculate maximum speed based on car type
        return 120.0;
    }
}

// Motorcycle.java
// Child class Motorcycle

public class Motorcycle extends Vehicle {
    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double engineDisplacement) {
        super(make, model, year, fuelType);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Calculate fuel efficiency based on engine displacement
        return 50.0 / (engineDisplacement + 1);
    }

    @Override
    public double calculateDistanceTraveled() {
        // Calculate distance traveled based on fuel efficiency
        return calculateFuelEfficiency() * 100;
    }

    @Override
    public double calculateMaximumSpeed() {
        // Calculate maximum speed based on motorcycle type
        return 160.0;
    }
}

// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        // Create a truck object
        Truck truck = new Truck("Ford", "F-150", 2020, "Diesel", 1000.0);

        // Create a car object
        Car car = new Car("Toyota", "Camry", 2018, "Gasoline", 5);

        // Create a motorcycle object
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2016, "Gasoline", 1200.0);

        // Print the details of each vehicle
        System.out.println("Truck:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Cargo Capacity: " + truck.getCargoCapacity());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled());
        System.out.println("Maximum Speed: " + truck.calculateMaximumSpeed());
        System.out.println();

        System.out.println("Car:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("Number of Seats: " + car.getNumberOfSeats());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled());
        System.out.println("Maximum Speed: " + car.calculateMaximumSpeed());
        System.out.println();

        System.out.println("Motorcycle:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Fuel Type: " + motorcycle.getFuelType());
        System.out.println("Engine Displacement: " + motorcycle.getEngineDisplacement());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency());
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled());
        System.out.println("Maximum Speed: " + motorcycle.calculateMaximumSpeed());
    }
}
