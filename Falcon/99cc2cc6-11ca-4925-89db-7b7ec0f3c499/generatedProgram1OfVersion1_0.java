import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        double root = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + root);
    }
}

