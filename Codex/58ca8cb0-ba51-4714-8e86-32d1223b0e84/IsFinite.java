import java.util.Scanner;

public class IsFinite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double/float value: ");
        double value = scanner.nextDouble();

        if (Double.isFinite(value)) {
            System.out.println("The value is finite.");
        } else {
            System.out.println("The value is not finite.");
        }
    }
}
