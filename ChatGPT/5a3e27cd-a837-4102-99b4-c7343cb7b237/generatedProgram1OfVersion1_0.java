public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeSalary(double salary) {
        this.employee_salary = salary;
    }

    public String getFormattedSalary() {
        return String.format("%.2f", employee_salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("John Doe");
        emp.setEmployeeSalary(50000.0);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: $" + emp.getFormattedSalary());
    }
}
