public class ConsecutiveNumbers {

    public static boolean areConsecutive(int a, int b, int c) {
        // Check if the numbers are consecutive
        return (a + 1 == b && b + 1 == c);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areConsecutive(1, 2, 3)); // true
        System.out.println(areConsecutive(1, 3, 5)); // false
        System.out.println(areConsecutive(0, 1, 2)); // true
        System.out.println(areConsecutive(-1, 0, 1)); // false
        System.out.println(areConsecutive(Integer.MIN_VALUE, Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2)); // true
        System.out.println(areConsecutive(Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE)); // true
    }
}
