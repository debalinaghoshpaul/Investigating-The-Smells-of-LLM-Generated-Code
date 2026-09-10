// Employee class
class Employee {
    // Method to calculate salary
    public double calculateSalary() {
        // Default implementation
        return 0.0;
    }
}

// Manager class
class Manager extends Employee {
    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        // Calculate and return manager's salary
        // Add your logic here
        return 0.0;
    }
}

// Programmer class
class Programmer extends Employee {
    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        // Calculate and return programmer's salary
        // Add your logic here
        return 0.0;
    }
}

// Main class
public class copilotTest {
    public static void main(String[] args) {
        // Create objects of Manager and Programmer
        Manager manager = new Manager();
        Programmer programmer = new Programmer();

        // Calculate and print salaries
        System.out.println("Manager's salary: " + manager.calculateSalary());
        System.out.println("Programmer's salary: " + programmer.calculateSalary());
    }
}