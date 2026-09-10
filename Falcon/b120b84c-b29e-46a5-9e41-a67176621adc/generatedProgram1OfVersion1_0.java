import java.util.Scanner;

public class PolyEval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = scanner.nextLine();
        int x = 3;
        int result = 0;
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case 'x':
                    result += x;
                    break;
                case '+':
                    result += x;
                    break;
                case '-':
                    result -= x;
                    break;
                case '*':
                    result *= x;
                    break;
                case '/':
                    result /= x;
                    break;
                default:
                    break;
            }
            x++;
        }
        System.out.println("The result is: " + result);
    }
}

// 