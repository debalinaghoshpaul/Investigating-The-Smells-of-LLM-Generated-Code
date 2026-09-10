import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        double num1 = 1235.0;
        double num2 = 2534.0;

        DecimalFormat df = new DecimalFormat("#.##");
        String num1Formatted = df.format(num1);
        String num2Formatted = df.format(num2);

        if (num1Formatted.equals(num2Formatted)) {
            System.out.println("These numbers are the same.");
        } else {
            System.out.println("These numbers are different.");
        }
    }
}
