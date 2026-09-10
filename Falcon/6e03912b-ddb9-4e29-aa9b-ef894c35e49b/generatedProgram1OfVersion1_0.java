public class Employee {
    private String name;
    private int salary;
    private Date hireDate;

    public Employee(String name, int salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 50000, new Date());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getHireDate());
    }
}

