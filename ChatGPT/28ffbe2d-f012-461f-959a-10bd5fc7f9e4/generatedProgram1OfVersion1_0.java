// Abstract class Employee
abstract class Employee {
    String name;
    int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Abstract method to calculate salary
    public abstract double calculateSalary();
    
    // Abstract method to display employee information
    public abstract void displayInfo();
}

// Subclass Manager
class Manager extends Employee {
    double salary;

    public Manager(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Calculate salary for Manager (just a sample calculation)
    @Override
    public double calculateSalary() {
        return salary + 5000; // Adding bonus for managers
    }

    // Display Manager information
    @Override
    public void displayInfo() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Subclass Programmer
class Programmer extends Employee {
    double salary;

    public Programmer(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Calculate salary for Programmer (just a sample calculation)
    @Override
    public double calculateSalary() {
        return salary + 3000; // Adding bonus for programmers
    }

    // Display Programmer information
    @Override
    public void displayInfo() {
        System.out.println("Programmer Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 35, 60000);
        manager.displayInfo();
        
        System.out.println();
        
        Programmer programmer = new Programmer("Jane Smith", 28, 50000);
        programmer.displayInfo();
    }
}
