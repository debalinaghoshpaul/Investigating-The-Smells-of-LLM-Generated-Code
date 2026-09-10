import java.text.DecimalFormat;

public class NumberFormatter {

    public static void main(String[] args) {
        // Create a DecimalFormat object with the desired pattern
        DecimalFormat formatter = new DecimalFormat("#,###");

        // Format the number and print it
        System.out.println(formatter.format(123456789)); // Output: 123,456,789
    }
}
