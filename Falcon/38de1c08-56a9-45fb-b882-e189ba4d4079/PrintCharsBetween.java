import java.util.Scanner;

public class PrintCharsBetween {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the starting and ending characters from the user.
        System.out.println("Enter the starting character:");
        char start = scanner.next().charAt(0);

        System.out.println("Enter the ending character:");
        char end = scanner.next().charAt(0);

        // Print the characters between the starting and ending characters.
        int count = 0;
        for (char c = start; c <= end; c++) {
            System.out.print(c);
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
