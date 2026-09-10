import java.util.Date;

public class Person implements Cloneable {
    private String name;
    private Date born;
    private Date died; // null indicates still alive.

    public Person(String initialName, Date birthDate, Date deathDate) {
        if (consistent(birthDate, deathDate)) {
            name = initialName;
            born = new Date(birthDate);
            if (deathDate == null)
                died = null;
            else
                died = new Date(deathDate);
        } else {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public Person(Person original) {
        if (original == null) {
            System.out.println("Fatal error.");
            System.exit(0);
        }
        name = original.name;
        born = new Date(original.born);
        if (original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

    public void setDeathYear(int newYear) {
        if (died == null) {
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        died.setYear(newYear);
        if (!consistent(born, died)) {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(born);
    }

    public Date getDeathDate() {
        if (died == null)
            return null;
        else
            return new Date(died);
    }

    private static boolean consistent(Date birthDate, Date deathDate) {
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else
            return (birthDate.before(deathDate) || birthDate.equals(deathDate));
    }

    private class Date implements Cloneable {
        private int year;
        private int month;
        private int day;

        public Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public Date(Date original) {
            this.year = original.year;
            this.month = original.month;
            this.day = original.day;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public boolean precedes(Date other) {
            if (year < other.year)
                return true;
            else if (year == other.year && month < other.month)
                return true;
            else if (year == other.year && month == other.month && day < other.day)
                return true;
            else
                return false;
        }

        public boolean equals(Date other) {
            return (year == other.year && month == other.month && day == other.day);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        // Test program
        Date birthDate = new Date(1990, 1, 1);
        Date deathDate = new Date(2022, 12, 31);
        Person person1 = new Person("John Doe", birthDate, deathDate);
        Person person2 = new Person(person1);

        System.out.println("Person 1: " + person1.getName() + ", Birth Date: " + person1.getBirthDate().getYear() + "-" + person1.getBirthDate().getMonth() + "-" + person1.getBirthDate().getDay());
        System.out.println("Person 2: " + person2.getName() + ", Birth Date: " + person2.getBirthDate().getYear() + "-" + person2.getBirthDate().getMonth() + "-" + person2.getBirthDate().getDay());
    }
}
