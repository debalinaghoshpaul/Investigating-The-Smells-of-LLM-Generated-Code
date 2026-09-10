import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and offset
        System.out.println("Enter the string to be rotated:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the offset:");
        int offset = scanner.nextInt();

        // Rotate the string
        String rotatedString = rotateString(inputString, offset);

        // Print the rotated string
        System.out.println("The rotated string is:");
        System.out.println(rotatedString);
    }

    public static String rotateString(String inputString, int offset) {
        // Check if the offset is valid
        if (offset < 0 || offset > inputString.length()) {
            throw new IllegalArgumentException("Invalid offset: " + offset);
        }

        // Rotate the string by creating a new string builder
        StringBuilder rotatedStringBuilder = new StringBuilder();

        // Append the substring from the offset to the end of the string
        rotatedStringBuilder.append(inputString.substring(offset));

        // Append the substring from the beginning of the string to the offset
        rotatedStringBuilder.append(inputString.substring(0, offset));

        // Return the rotated string
        return rotatedStringBuilder.toString();
    }

    // Test cases
    // Corner cases
    public static void testWithEmptyInput() {
        String inputString = "";
        int offset = 1;
        String expectedOutput = "";
        String actualOutput = rotateString(inputString, offset);
        assert expectedOutput.equals(actualOutput) : "Expected: " + expectedOutput + ", Actual: " + actualOutput;
    }

    public static void testWithNegativeOffset() {
        String inputString = "Hello";
        int offset = -1;
        String expectedOutput = "oHell";
        String actualOutput = rotateString(inputString, offset);
        assert expectedOutput.equals(actualOutput) : "Expected: " + expectedOutput + ", Actual: " + actualOutput;
    }

    public static void testWithOffsetEqualToStringLength() {
        String inputString = "Hello";
        int offset = inputString.length();
        String expectedOutput = "Hello";
        String actualOutput = rotateString(inputString, offset);
        assert expectedOutput.equals(actualOutput) : "Expected: " + expectedOutput + ", Actual: " + actualOutput;
    }

    public static void testWithOffsetGreaterThanStringLength() {
        String inputString = "Hello";
        int offset = inputString.length() + 1;
        String expectedOutput = "oHell";
        String actualOutput = rotateString(inputString, offset);
        assert expectedOutput.equals(actualOutput) : "Expected: " + expectedOutput + ", Actual: " + actualOutput;
    }
}
