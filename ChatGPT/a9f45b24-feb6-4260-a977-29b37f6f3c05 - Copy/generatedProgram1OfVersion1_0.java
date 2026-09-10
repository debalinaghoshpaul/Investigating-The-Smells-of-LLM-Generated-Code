
public class LargeIntegerSum {

    private static final int MAX_DIGITS = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] num1 = new char[MAX_DIGITS];
        char[] num2 = new char[MAX_DIGITS];
        int[] result = new int[MAX_DIGITS + 1];

        System.out.println("Enter the first positive integer (up to 20 digits): ");
        String num1Str = input.next();
        int len1 = num1Str.length();
        for (int i = 0; i < len1; i++) {
            num1[i] = num1Str.charAt(i);
        }

        System.out.println("Enter the second positive integer (up to 20 digits): ");
        String num2Str = input.next();
        int len2 = num2Str.length();
        for (int i = 0; i < len2; i++) {
            num2[i] = num2Str.charAt(i);
        }

        int carry = 0;
        int i = 0;
        while (i < len1 || i < len2) {
            int n1 = (i < len1) ? Character.getNumericValue(num1[i]) : 0;
            int n2 = (i < len2) ? Character.getNumericValue(num2[i]) : 0;
            int sum = n1 + n2 + carry;
            result[i] = sum % 10;
            carry = sum / 10;
            i++;
        }

        if (carry > 0) {
            result[i] = carry;
        }

        if (i > MAX_DIGITS) {
            System.out.println("Integer overflow. The result has more than 20 digits.");
        } else {
            System.out.print("The sum of the two numbers is: ");
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(result[j]);
            }
        }

    }
}