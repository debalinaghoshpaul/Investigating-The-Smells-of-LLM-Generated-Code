import java.util.Scanner;

public class PrintAll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three numbers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Print the three numbers
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
