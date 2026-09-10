public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(int employee_id, String employee_name, double employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public double getEmployeeSalary() {
        return employee_salary;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public static void main(String[] args) {
        int employee_id = 1;
        String employee_name = "John";
        double employee_salary = 1000.00;

        Employee employee = new Employee(employee_id, employee_name, employee_salary);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());
    }
}

