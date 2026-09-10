// Employee.java
// Parent class Employee

public abstract class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

}

// Manager.java
// Child class Manager

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

}

// Programmer.java
// Child class Programmer

public class Programmer extends Employee {

    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + overtimePay;
    }

}

// Main.java
// Main class

public class Main {

    public static void main(String[] args) {
        // Create an instance of Manager
        Manager manager = new Manager("John Doe", 5000.0, 1000.0);

        // Create an instance of Programmer
        Programmer programmer = new Programmer("Jane Doe", 4000.0, 500.0);

        // Print the salary of the Manager
        System.out.println("Manager's salary: $" + manager.calculateSalary());

        // Print the salary of the Programmer
        System.out.println("Programmer's salary: $" + programmer.calculateSalary());
    }

}
