public class Person {
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
            return (birthDate.precedes(deathDate) || birthDate.equals(deathDate));
    }

    private class Date {
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

        public boolean precedes(Date other) {
            if (this.year < other.year)
                return true;
            else if (this.year == other.year && this.month < other.month)
                return true;
            else if (this.year == other.year && this.month == other.month && this.day < other.day)
                return true;
            else
                return false;
        }

        public boolean equals(Date other) {
            return this.year == other.year && this.month == other.month && this.day == other.day;
        }
    }
}