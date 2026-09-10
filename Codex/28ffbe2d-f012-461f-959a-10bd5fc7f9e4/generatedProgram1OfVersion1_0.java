// Employee.java
abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
}

// Manager.java
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

// Programmer.java
class Programmer extends Employee {
    private double baseSalary;
    private double overtimePay;

    public Programmer(String name, String employeeId, double baseSalary, double overtimePay) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("John Doe", "EMP001", 5000.00, 1000.00);
        Employee programmer = new Programmer("Jane Smith", "EMP002", 4000.00, 500.00);

        manager.displayInfo();
        System.out.println();

        programmer.displayInfo();
    }
}
