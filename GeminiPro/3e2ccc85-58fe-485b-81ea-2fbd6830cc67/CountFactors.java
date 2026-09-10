import java.util.Scanner;

public class CountFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer:");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
