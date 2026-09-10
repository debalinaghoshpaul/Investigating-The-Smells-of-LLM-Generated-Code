public class NumberComparison {
    public static void main(String[] args) {
        int signedNumber1 = -10;
        int signedNumber2 = 5;

        // Comparing signed numbers
        if (signedNumber1 < signedNumber2) {
            System.out.println("Signed number 1 is less than signed number 2");
        } else if (signedNumber1 > signedNumber2) {
            System.out.println("Signed number 1 is greater than signed number 2");
        } else {
            System.out.println("Signed number 1 is equal to signed number 2");
        }

        // Comparing unsigned numbers
        int unsignedNumber1 = Integer.MAX_VALUE + 100;
        int unsignedNumber2 = Integer.MAX_VALUE;

        if (Integer.compareUnsigned(unsignedNumber1, unsignedNumber2) < 0) {
            System.out.println("Unsigned number 1 is less than unsigned number 2");
        } else if (Integer.compareUnsigned(unsignedNumber1, unsignedNumber2) > 0) {
            System.out.println("Unsigned number 1 is greater than unsigned number 2");
        } else {
            System.out.println("Unsigned number 1 is equal to unsigned number 2");
        }
    }
}