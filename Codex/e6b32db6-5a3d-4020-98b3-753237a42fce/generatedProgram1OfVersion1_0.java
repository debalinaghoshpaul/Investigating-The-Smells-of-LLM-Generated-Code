public class Employee {
    private String name;
    private Date hireDate;

    public Employee() {
        name = "No name";
        hireDate = new Date("January", 1, 1000);
    }

    public Employee(String theName, Date theDate) {
        if (theName == null || theDate == null) {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public Employee(Employee originalObject) {
        name = originalObject.name;
        hireDate = new Date(originalObject.hireDate);
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return new Date(hireDate);
    }

    public void setName(String newName) {
        if (newName == null) {
            System.out.println("Fatal Error setting employee name.");
            System.exit(0);
        } else {
            name = newName;
        }
    }

    public void setHireDate(Date newDate) {
        if (newDate == null) {
            System.out.println("Fatal Error setting employee hire date.");
            System.exit(0);
        } else {
            hireDate = new Date(newDate);
        }
    }

    public String toString() {
        return (name + " " + hireDate.toString());
    }

    public boolean equals(Employee otherEmployee) {
        return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
    }

    public class Date {
        private String month;
        private int day;
        private int year;

        public Date(String theMonth, int theDay, int theYear) {
            month = theMonth;
            day = theDay;
            year = theYear;
        }

        public Date(Date originalDate) {
            month = originalDate.month;
            day = originalDate.day;
            year = originalDate.year;
        }

        public String getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        public int getYear() {
            return year;
        }

        public void setMonth(String newMonth) {
            month = newMonth;
        }

        public void setDay(int newDay) {
            day = newDay;
        }

        public void setYear(int newYear) {
            year = newYear;
        }

        public String toString() {
            return (month + " " + day + ", " + year);
        }

        public boolean equals(Date otherDate) {
            return (month.equals(otherDate.month) && day == otherDate.day && year == otherDate.year);
        }
    }
}

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee() {
        super();
        wageRate = 0;
        hours = 0;
    }

    public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours) {
        super(theName, theDate);
        if (theWageRate >= 0 && theHours >= 0) {
            wageRate = theWageRate;
            hours = theHours;
        } else {
            System.out.println("Fatal Error: creating an illegal hourly employee.");
            System.exit(0);
        }
    }

    public HourlyEmployee(HourlyEmployee originalObject) {
        super(originalObject);
        wageRate = originalObject.wageRate;
        hours = originalObject.hours;
    }

    public double getRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public double getPay() {
        return wageRate * hours;
    }

    public void setHours(double hoursWorked) {
        if (hoursWorked >= 0) {
            hours = hoursWorked;
        } else {
            System.out.println("Fatal Error: Negative hours worked.");
            System.exit(0);
        }
    }

    public void setRate(double newWageRate) {
        if (newWageRate >= 0) {
            wageRate = newWageRate;
        } else {
            System.out.println("Fatal Error: Negative wage rate.");
            System.exit(0);
        }
    }

    public String toString() {
        return (getName() + " " + getHireDate().toString() + "\n$" + wageRate + " per hour for " + hours + " hours");
    }

    public boolean equals(HourlyEmployee other) {
        return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate())
                && wageRate == other.wageRate && hours == other.hours);
    }
}