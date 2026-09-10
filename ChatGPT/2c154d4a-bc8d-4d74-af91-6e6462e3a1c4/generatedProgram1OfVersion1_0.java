
public class Main {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        
        // Extracting primitive type values
        byte byteValue = bigInteger.byteValue();
        short shortValue = bigInteger.shortValue();
        int intValue = bigInteger.intValue();
        long longValue = bigInteger.longValue();
        float floatValue = bigInteger.floatValue();
        double doubleValue = bigInteger.doubleValue();
        boolean booleanValue = bigInteger.signum() == 0 ? false : true;
        char charValue = (char) bigInteger.intValue();
        
        System.out.println("BigInteger value: " + bigInteger);
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("Char value: " + charValue);
    }
}