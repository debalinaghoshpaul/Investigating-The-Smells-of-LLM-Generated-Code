public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSum(n - 1);
        }
    }
}
