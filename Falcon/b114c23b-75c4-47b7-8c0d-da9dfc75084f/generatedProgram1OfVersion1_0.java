public class PalindromicPrime {
    public static void main(String[] args) {
        for (int i = 2; i <= 120; i++) {
            if (isPalindromicPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPalindromicPrime(int n) {
        int num = n;
        while (num > 0) {
            if (num % 2!= 0) {
                return false;
            }
            num /= 2;
        }
        return true;
    }
}

