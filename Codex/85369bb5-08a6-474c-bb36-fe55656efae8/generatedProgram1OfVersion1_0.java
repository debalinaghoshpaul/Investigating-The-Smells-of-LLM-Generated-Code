import java.util.Scanner;

public class copilotTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        scanner.close();

        String weekdayName = getWeekdayName(number);
        System.out.println(weekdayName);
    }

    public static String getWeekdayName(int number) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (number >= 1 && number <= 7) {
            return weekdays[number - 1];
        } else {
            return "Invalid number";
        }
    }
}