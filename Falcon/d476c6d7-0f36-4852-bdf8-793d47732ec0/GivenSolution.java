package chapter_eight;

import java.util.Date;

public class Employee
{
    private String id, name, department;
    private double salary;
    private Date designation;
    private boolean[] days = new boolean[20];
    private int index = 0;


    public void leaves(boolean status)
    {
        days[index++] = status;

        if (status)
            salary -= 200;
    }


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


    public boolean[] getDays()
    {
        return days;
    }
}

package chapter_eight;

import java.util.Date;

/**
 * 3. Extend the previous problem to calculate the salary deductions based on
 * the number of days an employee is on leave. Consider 20 working days per month. Add
 * a method that calculates the deductions of each employee based on their leave
 * record. In your main method, create an array of type deduction filled with sample
 * data of all types of Employees. Finally calculate the total deduction that iterates
 * through the array and returns the total amount of deductions of all the employees
 * in a month.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_08_03
{
    private static final Employee[] employees = new Employee[50];

    public static void main(String[] args)
    {
        double deduction = fillAndCalculate();
        /* Deduction For This Month is $100000.0 */
        System.out.println("Deduction For This Month is $" + deduction);
    }

    public static double fillAndCalculate()
    {
        double deduction = 0;
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = new Employee("123"+i, "Sharaf Qeshta",
                    "Production", 2000 * (i+1), new Date());

            for (int j = 0; j < 20; j++)
            {
                employees[i].leaves(j % 2 == 0); // random
                if (!employees[i].getDays()[j])
                    deduction += 200;
            }

        }
        return deduction;
    }
}


