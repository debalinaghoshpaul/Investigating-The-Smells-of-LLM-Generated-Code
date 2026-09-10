import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundFloatToSpecifiedDecimals {

    public static void main(String[] args) {
        float number = 123.456789f;
        int decimals = 2;

        // Round the number to the specified number of decimals using BigDecimal
        BigDecimal roundedNumber = new BigDecimal(number).setScale(decimals, RoundingMode.HALF_UP);

        // Print the rounded number
        System.out.println("Rounded number: " + roundedNumber);
    }
}
