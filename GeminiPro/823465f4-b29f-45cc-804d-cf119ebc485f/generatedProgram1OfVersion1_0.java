import java.math.BigInteger;

public class ExtractPrimitiveTypeValueFromBigInteger {

    public static void main(String[] args) {
        // Create a BigInteger value
        BigInteger bigInteger = new BigInteger("1234567890");

        // Extract the primitive type value from the BigInteger
        int intValue = bigInteger.intValue();

        // Print the primitive type value
        System.out.println("The primitive type value is: " + intValue);
    }
}
