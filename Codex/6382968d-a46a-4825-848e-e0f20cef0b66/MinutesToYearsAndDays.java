import java.util.Scanner;

public class MinutesToYearsAndDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of minutes from the user
        System.out.println("Input the number of minutes:");
        int minutes = scanner.nextInt();

        // Convert the minutes to years and days
        int years = minutes / (60 * 24 * 365);
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);

        // Print the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
