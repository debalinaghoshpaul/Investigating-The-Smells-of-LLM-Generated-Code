import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Number 1 is greater than number 2.");
        } else if (num1 < num2) {
            System.out.println("Number 1 is less than number 2.");
        } else {
            System.out.println("Number 1 is equal to number 2.");
        }
    }
}
// 