
public class IntegersOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int num1 = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double average = (double) (num1 + num2) / 2;
        int distance = Math.abs(num1 - num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + diff);
        System.out.println("Product of two integers: " + product);
        System.out.println("Average of two integers: " + String.format("%.2f", average));
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);

        input.close();
    }
}
