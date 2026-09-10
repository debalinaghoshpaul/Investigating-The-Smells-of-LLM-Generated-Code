public class SumOfNumbers {

    public static int sumOfNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = sumOfNumbers(5);
        System.out.println(result); // Output: 15
    }
}
