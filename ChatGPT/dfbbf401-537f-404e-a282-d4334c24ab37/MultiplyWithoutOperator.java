
public class MultiplyWithoutOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = input.nextInt();

        System.out.print("Input the second number: ");
        int num2 = input.nextInt();

        int result = multiplyWithoutOperator(num1, num2);
        System.out.println("Result: " + result);
    }

    public static int multiplyWithoutOperator(int num1, int num2) {
        int result = 0;

        if (num2 > 0) {
            for (int i = 0; i < num2; i++) {
                result += num1;
            }
        } else if (num2 < 0) {
            for (int i = 0; i > num2; i--) {
                result -= num1;
            }
        }

        return result;
    }
}
