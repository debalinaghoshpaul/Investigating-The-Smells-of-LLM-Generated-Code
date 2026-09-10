public class Test {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        boolean result = checkIfSumOrDifferenceIs15(num1, num2);
        System.out.println(result);
    }

    public static boolean checkIfSumOrDifferenceIs15(int num1, int num2) {
        if (num1 == 15 || num2 == 15 || num1 + num2 == 15 || Math.abs(num1 - num2) == 15) {
            return true;
        } else {
            return false;
        }
    }
}