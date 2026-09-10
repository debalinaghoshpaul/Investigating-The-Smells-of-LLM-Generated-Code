import java.util.Scanner;

public class SumAndAverageOf5Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        System.out.println("Input the 5 numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        // Calculate the sum and average of the 5 numbers
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = (double) sum / 5;

        // Print the output
        System.out.println("The sum of 5 no is : " + sum);
        System.out.println("The Average is : " + average);
    }
}
