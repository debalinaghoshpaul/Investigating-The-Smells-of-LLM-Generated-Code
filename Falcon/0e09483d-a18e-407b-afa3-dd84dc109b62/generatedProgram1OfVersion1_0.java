import java.util.Scanner;

public class Friday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();
        System.out.println("Next Friday: " + getNextFriday(day));
        System.out.println("Previous Friday: " + getPreviousFriday(day));
    }

    public static String getNextFriday(String day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_WEEK, 5);
        return day + " " + calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static String getPreviousFriday(String day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_WEEK, -5);
        return day + " " + calendar.get(Calendar.DAY_OF_WEEK);
    }
}

