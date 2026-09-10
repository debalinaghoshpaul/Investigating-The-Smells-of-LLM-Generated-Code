public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int count = countBitsToFlip(a, b);
        System.out.println(count);
    }

    private static int countBitsToFlip(int a, int b) {
        int count = 0;
        int xor = a ^ b;
        while (xor > 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor >>= 1;
        }
        return count;
    }
}
