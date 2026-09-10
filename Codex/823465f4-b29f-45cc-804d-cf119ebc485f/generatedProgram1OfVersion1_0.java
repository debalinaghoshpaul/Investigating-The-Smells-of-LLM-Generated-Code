import java.math.BigInteger;

public class ExtractPrimitiveValue {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("123456789");

        // Extracting primitive type value
        byte byteValue = bigInteger.byteValue();
        short shortValue = bigInteger.shortValue();
        int intValue = bigInteger.intValue();
        long longValue = bigInteger.longValue();
        float floatValue = bigInteger.floatValue();
        double doubleValue = bigInteger.doubleValue();
        boolean booleanValue = (bigInteger.signum() != 0);
        char charValue = (char) bigInteger.intValue();

        // Printing the extracted values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("Char Value: " + charValue);
    }
}