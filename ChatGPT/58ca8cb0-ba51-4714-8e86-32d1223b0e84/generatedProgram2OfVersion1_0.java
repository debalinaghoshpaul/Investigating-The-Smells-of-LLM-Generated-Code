public class NumberComparison {
    public static void main(String[] args) {
        int signedNum1 = -10;
        int signedNum2 = 5;

        if (Integer.compare(signedNum1, signedNum2) > 0) {
            System.out.println(signedNum1 + " is greater than " + signedNum2);
        } else if (Integer.compare(signedNum1, signedNum2) < 0) {
            System.out.println(signedNum1 + " is less than " + signedNum2);
        } else {
            System.out.println(signedNum1 + " is equal to " + signedNum2);
        }

        long unsignedNum1 = Long.parseUnsignedLong("18446744073709551615");
        long unsignedNum2 = Long.parseUnsignedLong("9223372036854775807");

        if (Long.compareUnsigned(unsignedNum1, unsignedNum2) > 0) {
            System.out.println(unsignedNum1 + " is greater than " + unsignedNum2);
        } else if (Long.compareUnsigned(unsignedNum1, unsignedNum2) < 0) {
            System.out.println(unsignedNum1 + " is less than " + unsignedNum2);
        } else {
            System.out.println(unsignedNum1 + " is equal to " + unsignedNum2);
        }
    }
}
