public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public void updateSalary(double salary) {
        this.salary = salary;
    }
}

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Engineer", 1000.0);
        employee.calculateSalary();
        employee.updateSalary(2000.0);
        System.out.println(employee.getName());
        System.out.println(employee.getJobTitle());
        System.out.println(employee.getSalary());
    }
}

