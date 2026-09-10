public class ConsecutiveChecker {
    public static boolean areConsecutive(int num1, int num2, int num3) {
        if (num2 == num1 + 1 && num3 == num2 + 1) {
            return true;
        } else if (num1 == num2 + 1 && num3 == num1 + 1) {
            return true;
        } else if (num1 == num3 + 1 && num2 == num1 + 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(areConsecutive(1, 2, 3));
        System.out.println(areConsecutive(1, 2, 4));
        System.out.println(areConsecutive(1, 3, 2));
        System.out.println(areConsecutive(3, 2, 1));
    }   
}
