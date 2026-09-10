import java.util.Date;

public class GetYearMonth {
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();

        int year = startDate.getYear();
        int month = startDate.getMonth();
        int day = startDate.getDate();

        int year2 = endDate.getYear();
        int month2 = endDate.getMonth();
        int day2 = endDate.getDate();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year2: " + year2);
        System.out.println("Month2: " + month2);
        System.out.println("Day2: " + day2);
    }
}

