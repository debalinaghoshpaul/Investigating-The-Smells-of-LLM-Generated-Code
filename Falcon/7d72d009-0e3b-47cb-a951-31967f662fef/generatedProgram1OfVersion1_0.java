import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double absVal = Math.abs(num);
        System.out.println("The absolute value of " + num + " is " + absVal);
    }
}

