import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.println("Input the 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            sum += number;
        }

        average = (double) sum / 5;

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);

        input.close();
    }
}