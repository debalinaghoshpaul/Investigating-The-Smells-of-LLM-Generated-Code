public class Vehicle {
    private double tankSize;
    private double efficiency;
    private double fuelInTank;

    // Constructor
    public Vehicle(double tankSize, double efficiency, double fuelInTank) {
        this.tankSize = tankSize;
        this.efficiency = efficiency;
        this.fuelInTank = fuelInTank;
    }

    // Accessor method to return initial tank size, efficiency and fuel in tank
    public String getInitialValues() {
        return "Initial tank size: " + tankSize + ", Initial efficiency: " + efficiency + ", Initial fuel in tank: " + fuelInTank;
    }

    // Mutator method to calculate and add petrol to the tank
    public void addPetrol(double petrolToAdd) {
        double maxPetrol = tankSize - fuelInTank;
        if (petrolToAdd <= maxPetrol) {
            fuelInTank += petrolToAdd;
            System.out.println("Petrol added successfully. Current fuel in tank: " + fuelInTank);
        } else {
            System.out.println("Cannot add more petrol than the tank capacity. Maximum petrol that can be added: " + maxPetrol);
        }
    }

    // Method to calculate the distance that can be traveled with the available fuel and efficiency
    public double driveTo(double distance) {
        double maxDistance = fuelInTank * efficiency;
        if (distance <= maxDistance) {
            fuelInTank -= distance / efficiency;
            return distance;
        } else {
            fuelInTank = 0;
            return maxDistance;
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle(50, 10, 25);
        System.out.println(car.getInitialValues());

        car.addPetrol(30);
        System.out.println("Distance traveled: " + car.driveTo(200));
        System.out.println("Remaining fuel in tank: " + car.fuelInTank);
    }
}
