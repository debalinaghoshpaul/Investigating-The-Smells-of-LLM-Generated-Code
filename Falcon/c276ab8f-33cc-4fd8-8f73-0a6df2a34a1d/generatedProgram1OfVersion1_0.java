public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class Main {
    public static void main(String[] args) {
        for (Month month : Months.values()) {
            System.out.println(month.name());
        }
    }
}

