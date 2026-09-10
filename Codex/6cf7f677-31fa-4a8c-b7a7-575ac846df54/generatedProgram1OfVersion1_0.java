import java.text.DecimalFormat;

public class RoundingExample {
    public static void main(String[] args) {
        float number = 3.14159f; // The float number you want to round
        int decimals = 2; // The number of decimals to round to

        // Create a DecimalFormat object with the desired format
        DecimalFormat df = new DecimalFormat("#." + "0".repeat(decimals));

        // Round the number to the specified decimals
        String roundedNumber = df.format(number);

        // Print the rounded number
        System.out.println("Rounded number: " + roundedNumber);
    }
}