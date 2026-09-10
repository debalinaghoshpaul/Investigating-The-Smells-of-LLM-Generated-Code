
public class LargeIntegerAddition {

    public static final int MAX_DIGITS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] num1 = new char[MAX_DIGITS];
        char[] num2 = new char[MAX_DIGITS];
        int[] result = new int[MAX_DIGITS + 1]; // +1 in case of carry over

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.print("Enter a positive integer (up to 20 digits): ");
            String num1Str = scanner.next();
            System.out.print("Enter another positive integer (up to 20 digits): ");
            String num2Str = scanner.next();

            // Validate input
            if(num1Str.length() > MAX_DIGITS || num2Str.length() > MAX_DIGITS) {
                System.out.println("Input integers exceed maximum number of digits.");
                continue;
            }

            // Store digits in array
            for (int i = 0; i < num1Str.length(); i++) {
                num1[MAX_DIGITS - 1 - i] = num1Str.charAt(i);
            }
            for (int i = 0; i < num2Str.length(); i++) {
                num2[MAX_DIGITS - 1 - i] = num2Str.charAt(i);
            }

            // Perform addition
            int carry = 0;
            for (int i = 0; i < MAX_DIGITS; i++) {
                int sum = Character.getNumericValue(num1[i]) + Character.getNumericValue(num2[i]) + carry;
                result[i] = sum % 10;
                carry = sum / 10;
            }

            // Check for integer overflow
            if (carry > 0) {
                System.out.println("Integer overflow");
            } else {
                // Print result
                boolean leadingZeros = true;
                for (int i = MAX_DIGITS - 1; i >= 0; i--) {
                    if (result[i] != 0) {
                        leadingZeros = false;
                    }
                    if (!leadingZeros) {
                        System.out.print(result[i]);
                    }
                }
                System.out.println();
            }

            System.out.print("Do you want to perform another addition? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                continueAdding = false;
            }
        }
    }
}