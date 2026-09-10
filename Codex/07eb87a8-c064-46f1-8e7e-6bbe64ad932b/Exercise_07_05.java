package chapter_seven;

/**
 * 5. Give the definition of a class named Doctor whose objects are records for a clinic’s
 * doctors. This class will be a derived class of the class SalariedEmployee given in
 * Display 7.5. A Doctor record has the doctor’s specialty (such as "Pediatrician",
 * "Obstetrician", "General Practitioner", and so forth; so use the type String)
 * and office visit fee (use type double). Be sure your class has a reasonable complement
 * of constructors, accessor, and mutator methods, and suitably defined equals and
 * toString methods. Write a program to test all your methods.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_07_05
{
    public static void main(String[] args)
    {
        Doctor doctor1 = new Doctor("Obstetrician", 50);
        Doctor doctor2 = new Doctor("General Practitioner", 80);



        /*
        * No name January 1, 1000
        * $0.0 per year
        *  Speciality: Obstetrician
        *  Office Visit Fee: $50.0
        * */
        System.out.println(doctor1);

        /*
        * No name January 1, 1000
        * $0.0 per year
        *  Speciality: General Practitioner
        *  Office Visit Fee: $80.0
        * */
        System.out.println(doctor2);

        Doctor doctor3 = new Doctor("Obstetrician", 50);

        System.out.println(doctor1.equals(doctor2)); // false
        System.out.println(doctor1.equals(doctor3)); // true

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

public class Doctor extends SalariedEmployee
{
    private String specialty;
    private double officeVisitFee;

    public Doctor(String specialty,
                  double officeVisitFee)
    {
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public Doctor(String theName, Date theDate,
                  double theSalary, String specialty,
                  double officeVisitFee)
    {
        super(theName, theDate, theSalary);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }


    public Doctor(SalariedEmployee originalObject,
                  String specialty, double officeVisitFee)
    {
        super(originalObject);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public double getOfficeVisitFee()
    {
        return officeVisitFee;
    }

    public void setOfficeVisitFee(double officeVisitFee)
    {
        this.officeVisitFee = officeVisitFee;
    }

    public boolean equals(Doctor other)
    {
        return super.equals(other)
                && getSpecialty().equals(other.getSpecialty())
                && getOfficeVisitFee() == other.getOfficeVisitFee();
    }


    public String toString()
    {
        return super.toString()
                + "\n Speciality: " + getSpecialty()
                + "\n Office Visit Fee: $" + getOfficeVisitFee();
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
