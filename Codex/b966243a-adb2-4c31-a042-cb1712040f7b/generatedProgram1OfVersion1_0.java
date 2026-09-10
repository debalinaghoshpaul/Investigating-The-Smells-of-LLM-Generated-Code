import java.text.DecimalFormat;
import java.util.Scanner;

public class CopilotTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String formattedNum1 = decimalFormat.format(num1);
        String formattedNum2 = decimalFormat.format(num2);

        if (formattedNum1.equals(formattedNum2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}