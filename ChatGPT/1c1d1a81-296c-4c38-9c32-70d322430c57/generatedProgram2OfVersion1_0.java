public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2021, 10, 15);

        System.out.println("Initial Date:");
        date.displayDate();

        date.setYear(2022);
        date.setMonth(11);
        date.setDay(20);

        System.out.println("\nUpdated Date:");
        date.displayDate();
    }
}
