// Employee class
class Employee {
    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        // Add your salary calculation logic here
        return 0.0;
    }
}

// HRManager class
class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is working");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding an employee");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println("Employee Salary: " + employee.getSalary());

        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
    }
}