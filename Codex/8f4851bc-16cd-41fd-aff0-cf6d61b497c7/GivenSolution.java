package chapter_seven;

/**
 * 4. Define a class called Administrator, which is a derived class of the class
 * SalariedEmployee in Display 7.5. You are to supply the following additional
 * instance variables and methods:
 * • An instance variable of type String that contains the administrator’s title (such
 * as "Director" or "Vice President").
 * • An instance variable of type String that contains the administrator’s area of
 * responsibility (such as "Production", "Accounting", or "Personnel").
 * • An instance variable of type String that contains the name of this administrator’s
 * immediate supervisor.
 * • Suitable constructors, and suitable accessor and mutator methods.
 * • A method for reading in an administrator’s data from the keyboard.
 *  Override the definitions for the methods equals and toString so they are appropriate
 *  to the class Administrator.
 *  Also, write a suitable test program.
 *
 *  @author Sharaf Qeshta */


public class Exercise_07_04
{
    public static void main(String[] args)
    {
        Administrator admin1 = new Administrator("Sharaf Qeshta",
                new Date(10, 15, 2014), 10000,
                "Director", "Production", "John Smith");

        Administrator admin2 = new Administrator("John Smith",
                new Date(1, 17, 2010), 15000,
                "Vice President", "Production", "Tom");


        /*
        * Sharaf Qeshta October 15, 2014
        * $10000.0 per year
        * Director
        * John Smith
        * Production
        * */
        System.out.println(admin1);

        /*
        * John Smith January 17, 2010
        * $15000.0 per year
        * Vice President
        * Tom
        * Production
        * */
        System.out.println(admin2);


        System.out.println(admin1.equals(admin2)); // false


    }

}
package chapter_seven;

public class Administrator extends SalariedEmployee
{
    String title, responsibility, immediateSupervisor;

    public Administrator(String title, String responsibility,
                         String immediateSupervisor)
    {
        this.title = title;
        this.responsibility = responsibility;
        this.immediateSupervisor = immediateSupervisor;
    }


    public Administrator(String theName, Date theDate, double theSalary,
                         String title, String responsibility,
                         String immediateSupervisor)
    {
        super(theName, theDate, theSalary);
        this.title = title;
        this.responsibility = responsibility;
        this.immediateSupervisor = immediateSupervisor;
    }


    public Administrator(SalariedEmployee originalObject, String title,
                         String responsibility, String immediateSupervisor)
    {
        super(originalObject);
        this.title = title;
        this.responsibility = responsibility;
        this.immediateSupervisor = immediateSupervisor;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getResponsibility()
    {
        return responsibility;
    }

    public void setResponsibility(String responsibility)
    {
        this.responsibility = responsibility;
    }

    public String getImmediateSupervisor()
    {
        return immediateSupervisor;
    }

    public void setImmediateSupervisor(String immediateSupervisor)
    {
        this.immediateSupervisor = immediateSupervisor;
    }


    public String toString()
    {
        return (super.toString() +
                "\n" + getTitle() + "\n" + getImmediateSupervisor()
                + "\n" + getResponsibility());
    }

    public boolean equals(Administrator other)
    {
        return (super.equals(other)
                && getTitle().equals(other.getTitle())
                && getResponsibility().equals(other.getResponsibility())
                && getImmediateSupervisor().equals(other.getImmediateSupervisor()));
    }
}
package chapter_seven;

import java.util.Scanner;

public class Date
{
    private String month;
    private int day;
    private int year;

    public Date()
    {
        month = "January";
        day = 1;
        year = 1000;
    }

    public Date(int monthInt, int day, int year)
    {
        setDate(monthInt, day, year);
    }

    public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }

    public Date(int year)
    {
        setDate(1, 1, year);
    }

    public Date(Date aDate)
    {
        if (aDate == null)
        {
            System.out.println("Fatal Error.");
            System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public void setDate(int monthInt, int day, int year)
    {
        if (dateOK(monthInt, day, year))
        {
            this.month = monthString(monthInt);
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(String monthString, int day, int year)
    {
        if (dateOK(monthString, day, year))
        {
            this.month = monthString;
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setDate(int year)
    {
        setDate(1, 1, year);
    }

    public void setYear(int year)
    {
        if ( (year < 1000) || (year > 9999) )
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }

    public void setMonth(int monthNumber)
    {
        if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            month = monthString(monthNumber);
    }

    public void setDay(int day)
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }


    public int getMonth()
    {
        if (month.equals("January"))
            return 1;
        else if (month.equals("February"))
            return 2;
        else if (month.equals("March"))
            return 3;
        else if (month.equals("April"))
            return 4;
        else if (month.equals("May"))
            return 5;
        else if (month.equals("June"))
            return 6;
        else if (month.equals("July"))
            return 7;
        else if (month.equals("August"))
            return 8;
        else if (month.equals("September"))
            return 9;
        else if (month.equals("October"))
            return 10;
        else if (month.equals("November"))
            return 11;
        else if (month.equals("December"))
            return 12;
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String toString()
    {
        return (month + " " + day + ", " + year);
    }

    public boolean equals(Date otherDate)
    {
        return ( (month.equals(otherDate.month))
                && (day == otherDate.day)
                && (year == otherDate.year) );
    }

    public Boolean precedes(Date otherDate)
    {
        return ( (year < otherDate.year) ||
                (year == otherDate.year && getMonth() <
                        otherDate.getMonth()) ||
                (year == otherDate.year && month.equals(otherDate.month)
                        && day < otherDate.day) );
    }

    public void readInput()
    {
        boolean tryAgain = true;
        Scanner keyboard = new Scanner(System.in);
        while (tryAgain)
        {
            System.out.println("Enter month, day, and year.");
            System.out.println("Do not use a comma.");
            String monthInput = keyboard.next();
            int dayInput = keyboard.nextInt();
            int yearInput = keyboard.nextInt();
            if (dateOK(monthInput, dayInput, yearInput) )
            {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }
            else
                System.out.println("Illegal date. Reenter input.");
        }
    }


    private boolean dateOK(int monthInt, int dayInt, int yearInt)
    {
        return ( (monthInt >= 1) && (monthInt <= 12) &&
                (dayInt >= 1) && (dayInt <= 31) &&
                (yearInt >= 1000) && (yearInt <= 9999) );
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return ( monthOK(monthString) &&
                (dayInt >= 1) && (dayInt <= 31) &&
                (yearInt >= 1000) && (yearInt <= 9999) );
    }

    private boolean monthOK(String month)
    {
        return (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December") );
    }

    private String monthString(int monthNumber)
    {
        switch (monthNumber)
        {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }


}
package chapter_seven;



/**
 Class Invariant: All objects have a name string and hire date.
 A name string of "No name" indicates no real name specified yet.
 A hire date of January 1, 1000 indicates no real hire date specified yet.
 */

public class Employee
{
    private String name;
    private Date hireDate;
    public Employee()
    {
        name = "No name";
        hireDate = new Date("January", 1, 1000); //Just a placeholder.
    }

    /**
        Precondition: Neither theName nor theDate is null.
    */
    public Employee(String theName, Date theDate)
    {
        if (theName == null || theDate == null)
        {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public Employee(Employee originalObject)
    {
        name = originalObject.name;
        hireDate = new Date(originalObject.hireDate);
    }


    public String getName()
    {
        return name;
    }

    public Date getHireDate()
    {
        return new Date(hireDate);
    }

    /**
        Precondition newName is not null.
     */
    public void setName(String newName)
    {
        if (newName == null)
        {
            System.out.println("Fatal Error setting employee name.");
            System.exit(0);
        }
        else
            name = newName;
    }

    /**
        Precondition newDate is not null.
    */
    public void setHireDate(Date newDate)
    {
        if (newDate == null)
        {
            System.out.println("Fatal Error setting employee hire " +
                "date.");
            System.exit(0);
        }
        else
            hireDate = new Date(newDate);
    }

    public String toString()
    {
        return (name + " " + hireDate.toString());
    }

    public boolean equals(Employee otherEmployee)
    {
        return (name.equals(otherEmployee.name)
            && hireDate.equals(otherEmployee.hireDate));
    }
}
package chapter_seven;

/**
 Class Invariant: All objects have a name string, hire date,
 and nonnegative salary. A name string of "No name" indicates
 no real name specified yet. A hire date of January 1, 1000 indicates
 no real hire date specified yet.
*/

public class SalariedEmployee extends Employee
{
    private double salary; //annual
    public SalariedEmployee()
    {
        super();
        salary = 0;
    }
    /**
        Precondition: Neither theName nor theDate is null;
        theSalary is nonnegative.
     */
    public SalariedEmployee(String theName, Date theDate, double theSalary)
    {
        super(theName, theDate);
        if (theSalary >= 0)
            salary = theSalary;
        else
        {
            System.out.println("Fatal Error: Negative salary.");
            System.exit(0);
        }
    }

    public SalariedEmployee(SalariedEmployee originalObject)
    {
        super(originalObject);
        salary = originalObject.salary;
    }

    public double getSalary()
    {
        return salary;
    }

    /**
        Returns the pay for the month.
     */
    public double getPay()
    {
        return salary/12;
    }

    /** Precondition: newSalary is nonnegative. */
    public void setSalary(double newSalary)
    {
        if (newSalary >= 0)
            salary = newSalary;
        else
        {
            System.out.println("Fatal Error: Negative salary.");
            System.exit(0);
        }
    }

    public String toString()
    {
        return (getName() + " " + getHireDate().toString()
            + "\n$" + salary + " per year");
    }

    public boolean equals(SalariedEmployee other)
    {
        return (getName().equals(other.getName())
            && getHireDate().equals(other.getHireDate())
            && salary == other.salary);
    }
}
