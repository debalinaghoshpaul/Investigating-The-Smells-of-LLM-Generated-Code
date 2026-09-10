class Employee {
    public void work() {
        System.out.println("Working...");
    }

    public int getSalary() {
        return 1000;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("Managing HR...");
    }

    public void addEmployee() {
        System.out.println("Adding employee...");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println("Salary: " + employee.getSalary());

        HRManager hrManager = new HRManager();
        hrManager.work();
        System.out.println("Salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }
}
