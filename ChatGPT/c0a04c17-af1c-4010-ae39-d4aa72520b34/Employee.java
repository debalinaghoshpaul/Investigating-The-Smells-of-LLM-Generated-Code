import java.util.Scanner;

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

    public void calculateSalary() {
        // Calculate the salary based on the job title
        switch (jobTitle) {
            case "Manager":
                salary = 100000.0;
                break;
            case "Engineer":
                salary = 80000.0;
                break;
            case "Clerk":
                salary = 50000.0;
                break;
            default:
                salary = 0.0;
        }
    }

    public void updateSalary(double percentage) {
        // Update the salary based on the percentage
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the employee's name, job title, and salary
        System.out.println("Enter the employee's name:");
        String name = scanner.nextLine();
        System.out.println("Enter the employee's job title:");
        String jobTitle = scanner.nextLine();
        System.out.println("Enter the employee's salary:");
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, jobTitle, salary);

        // Calculate the employee's salary
        employee.calculateSalary();

        // Update the employee's salary
        System.out.println("Enter the percentage to update the salary:");
        double percentage = scanner.nextDouble();
        employee.updateSalary(percentage);

        // Print the employee's information
        System.out.println(employee);
    }
}
