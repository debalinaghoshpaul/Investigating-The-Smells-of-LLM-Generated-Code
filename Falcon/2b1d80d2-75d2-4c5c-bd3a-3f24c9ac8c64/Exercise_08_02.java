package chapter_eight;

import java.util.Date;

public class Clerk extends Employee
{
    public double addBonus(){ return getSalary() + 100; }

    public void display()
    {
        display("Clerk");
    }


    public Clerk() {}

    public Clerk(String id, String name, String department,
                 double salary, Date designation)
    {
        super(id, name, department, salary, designation);
    }
}

package chapter_eight;

import java.util.Date;

public class Employee
{
    private String id, name, department;
    private double salary;
    private Date designation;

    public Employee()
    {
        id = ""; name = "No Name Yet!";
        department = "No Department Yet!";
        designation = new Date();
    }

    public Employee(String id, String name,
                    String department, double salary,
                    Date designation)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public double addBonus(){ return salary + 200; }

    public boolean equals(Employee other)
    {
        return other.getDesignation().equals(designation);
    }

    public void display(String key)
    {
        System.out.println(key + " ID: " + id
        + ", " + key + " Name: " + name
                + ", " + key + " Department: "
                + department + ", " + key
                + "Salary: $" + salary + ", "
                + key + " Designation: " + designation);
    }


    public void display()
    {
        display("Employee");
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Date getDesignation()
    {
        return designation;
    }

    public void setDesignation(Date designation)
    {
        this.designation = designation;
    }
}

package chapter_eight;

import java.util.Date;

/**
 * 2. Create a class named Employee that can be used to calculate the salaries of different
 * employees. The Employee class should keep a track of the employee ID, name,
 * department, salary, and designation with appropriate accessor and mutator methods.
 * Also create an equals() method that overrides Object’s equals() method,
 * where employees can check if their designation is identical. Next, create two
 * additional classes named Manager and Clerk that are derived from Employee. Create an
 * overridden method named addBonus that returns the salary of the employee after
 * adding up the bonus. There is a default bonus of $200/month. Managers have a
 * bonus of $300/month and clerks have a bonus of $100/month. Finally create a
 * display method to print the details of the employee. You may assume the initial salary
 * of an employee and other necessary values. Test your classes from a main method
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_02
{
    public static void main(String[] args) {
        Employee employee = new Employee("123", "Sharaf Qeshta",
                "Production", 20000, new Date());

        Employee manager = new Manager("124", "John Smith",
                "Production", 29000, new Date());

        Employee clerk = new Clerk("125", "John Smith",
                "Production", 25000, new Date());

        /* Employee ID: 123, Employee Name: Sharaf Qeshta, Employee Department: Production, EmployeeSalary: $20000.0, Employee Designation: Sat Apr 09 05:25:00 PDT 2022 */
        employee.display();

        /* Manager ID: 124, Manager Name: John Smith, Manager Department: Production, ManagerSalary: $29000.0, Manager Designation: Sat Apr 09 05:25:00 PDT 2022 */
        manager.display();

        /* Clerk ID: 125, Clerk Name: John Smith, Clerk Department: Production, ClerkSalary: $25000.0, Clerk Designation: Sat Apr 09 05:25:00 PDT 2022 */
        clerk.display();


        System.out.println(employee.addBonus()); // 20200.0
        System.out.println(manager.addBonus()); // 29300.0
        System.out.println(clerk.addBonus()); // 25100.0

    }
}

package chapter_eight;

import java.util.Date;

public class Manager extends Employee
{
    public double addBonus(){ return getSalary() + 300; }

    public void display()
    {
       display("Manager");
    }

    public Manager() {}

    public Manager(String id, String name,
                   String department, double salary, Date designation)
    {
        super(id, name, department, salary, designation);
    }
}


