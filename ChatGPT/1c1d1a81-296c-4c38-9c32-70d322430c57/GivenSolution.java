package chapter_four;

/**
 * 8. Redefine the class Date in Display 4.13 so that the instance variable for the month
 * is of type int instead of type String. None of the method headings should change
 * in any way. In particular, no String type parameters should change to int type
 * parameters. You must redefine the methods to make things work out. Any program
 * that uses the Date class from Display 4.13 should be able to use your Date class
 * without any changes in the program. In particular, the program in Display 4.14
 * should work the same whether the Date class is defined as in Display 4.13 or is
 * defined as you do it for this project. Write a test program (or programs) that tests
 * each method in your class definition.
 *
 *
 * @author sharaf qeshta
 * */

public class Exercise_04_08
{
    public static void main(String[] args)
    {
        Date date1 = new Date("December", 16, 1770),
                date2 = new Date(1, 27, 1756),
                date3 = new Date(1882),
                date4 = new Date();
        System.out.println("Whose birthday is " + date1 + "?");
        System.out.println("Whose birthday is " + date2 + "?");
        System.out.println("Whose birthday is " + date3 + "?");
        System.out.println("The default date is " + date4 + ".");

        /*
        * before edit
        * Whose birthday is December 16, 1770?
        * Whose birthday is January 27, 1756?
        * Whose birthday is January 1, 1882?
        * The default date is January 1, 1000.
        * */

        /*
         * after edit
         * Whose birthday is December 16, 1770?
         * Whose birthday is January 27, 1756?
         * Whose birthday is January 1, 1882?
         * The default date is January 1, 1000.
         * */


    }
}

//Second Part

package chapter_four;

import java.util.Scanner;

public class Date
{
    private int month;
    private int day;
    private int year;

    public Date()
    {
        month = getMonth("January");
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
            this.month = monthInt;
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
            this.month = getMonth(monthString);
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
            month = monthNumber;
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


    public int getMonth(String month)
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
        return (monthString(month) + " " + day + ", " + year);
    }

    public boolean equals(Date otherDate)
    {
        return ( (month == otherDate.month)
                && (day == otherDate.day)
                && (year == otherDate.year) );
    }

    public Boolean precedes(Date otherDate)
    {
        return ( (year < otherDate.year) ||
                (year == otherDate.year && month <
                        otherDate.month) ||
                (year == otherDate.year && month == otherDate.month
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
