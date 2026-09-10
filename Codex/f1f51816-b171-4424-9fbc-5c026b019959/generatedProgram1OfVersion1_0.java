import java.util.regex.*;

public class MathematicalExpressionChecker {

    public static boolean isMathematicalExpression(String input) {
        Pattern pattern = Pattern.compile("^[\\d\\.\\+\\-\\*\\/\\^\\(\\)]+$");
        return pattern.matcher(input).matches();
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "1+2*3", // valid mathematical expression
                "1+2*3)4", // invalid mathematical expression - missing closing parenthesis
                "1+2.3", // valid mathematical expression
                "1+2.3e-5", // valid mathematical expression
                "1+2i", // invalid mathematical expression - contains imaginary unit
                "1+2\\", // invalid mathematical expression - contains backslash
                "1+(2*3)", // valid mathematical expression
                "1+(2*3", // invalid mathematical expression - missing closing parenthesis
                "1+()", // invalid mathematical expression - empty parentheses
                "1+2-", // invalid mathematical expression - missing operand after minus sign
                "1+2(3)", // invalid mathematical expression - missing closing parenthesis
                "1+2^3^4", // invalid mathematical expression - consecutive exponentiation
                "(1+2)*3", // valid mathematical expression
                "(1+2)*3)", // invalid mathematical expression - extra closing parenthesis
                "(1+2)*3(4)", // invalid mathematical expression - missing closing parenthesis
                "(1+2)3", // invalid mathematical expression - missing multiplication or division sign
                "1+(2*3)+4", // valid mathematical expression
                "1+(2*3)+4(5)", // invalid mathematical expression - missing closing parenthesis
                "1+(2*3)+4\\5", // invalid mathematical expression - contains backslash
                "1+(2*3)+4+5i", // invalid mathematical expression - contains imaginary unit
                "1+(2*3)+4+5e-6", // valid mathematical expression
                "1+(2*3)+4+5e-6i", // invalid mathematical expression - contains imaginary unit
                "1+(2*3)+4+5(", // invalid mathematical expression - missing closing parenthesis
                "1+(2*3)+4+5)", // invalid mathematical expression - extra closing parenthesis
                "1+(2*3)+4+5(6)", // invalid mathematical expression - missing closing parenthesis
                "1+(2*3)+4+5(6)7", // invalid mathematical expression - missing closing parenthesis
                "1+(2*3)+4+5(6)7)", // invalid mathematical expression - extra closing parenthesis
                "1+(2*3)+4+5(6)7\\8", // invalid mathematical expression - contains backslash
                "1+(2*3)+4+5(6)7i", // invalid mathematical expression - contains imaginary unit
        };

        for (String testCase : testCases) {
            System.out.println(String.format("Input: %s, Result: %s", testCase, isMathematicalExpression(testCase)));
        }
    }
}
