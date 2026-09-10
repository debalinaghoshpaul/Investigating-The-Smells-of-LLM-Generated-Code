import java.util.Scanner;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Check if the sum of the first two integers is greater than the third integer
        if (num1 + num2 > num3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
