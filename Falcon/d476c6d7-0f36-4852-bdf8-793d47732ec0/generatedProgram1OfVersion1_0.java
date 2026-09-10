import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;
    private int leavesTaken;

    public Employee(String name, int id, double salary, int leavesTaken) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.leavesTaken = leavesTaken;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public double calculateDeductions() {
        double deduction = 0;
        if (leavesTaken > 0) {
            deduction += (salary / 20) * leavesTaken;
        }
        return deduction;
    }
}

class Deduction {
    private Employee employee;
    private double deductionAmount;

    public Deduction(Employee employee, double deductionAmount) {
        this.employee = employee;
        this.deductionAmount = deductionAmount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getDeductionAmount() {
        return deductionAmount;
    }
}

public class EmployeeDeductions {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1, 10000, 2);
        Employee employee2 = new Employee("Mary", 2, 15000, 1);
        Employee employee3 = new Employee("Bob", 3, 20000, 3);

        Deduction deduction1 = new Deduction(employee1, employee1.calculateDeductions());
        Deduction deduction2 = new Deduction(employee2, employee2.calculateDeductions());
        Deduction deduction3 = new Deduction(employee3, employee3.calculateDeductions());

        Deduction[] deductions = {deduction1, deduction2, deduction3};

        double totalDeductions = 0;
        for (Deduction deduction : deductions) {
            totalDeductions += deduction.getDeductionAmount();
        }

        System.out.println("Total deductions: " + totalDeductions);
    }
}
