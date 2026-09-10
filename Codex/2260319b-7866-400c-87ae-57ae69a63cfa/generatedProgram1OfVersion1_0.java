import java.util.Scanner;

public class copilotTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = scanner.nextDouble();
        
        if (number == 0) {
            System.out.println("Input value: " + number + " Zero number");
        } else if (number > 0) {
            System.out.print("Input value: " + number + " Positive ");
            if (Math.abs(number) < 1) {
                System.out.println("small number");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("large number");
            } else {
                System.out.println("number");
            }
        } else {
            System.out.print("Input value: " + number + " Negative ");
            if (Math.abs(number) < 1) {
                System.out.println("small number");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("large number");
            } else {
                System.out.println("number");
            }
        }
    }
}