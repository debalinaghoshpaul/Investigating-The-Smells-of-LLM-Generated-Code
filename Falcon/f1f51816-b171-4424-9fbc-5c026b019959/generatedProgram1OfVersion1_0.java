import java.util.Scanner;

public class CheckExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        boolean isExpression = false;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c) || c == '+' || c == '-' || c == '*' || c == '/') {
                isExpression = true;
                break;
            }
        }
        if (isExpression) {
            System.out.println("The expression is valid");
        } else {
            System.out.println("The expression is not valid");
        }
    }
}

// 