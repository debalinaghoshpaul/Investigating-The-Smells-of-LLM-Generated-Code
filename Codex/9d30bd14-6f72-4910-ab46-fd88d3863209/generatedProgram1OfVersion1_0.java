public class CountNumbersWithoutSeven {
    public static void main(String[] args) {
        int n = 100; // replace with your desired number

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (containsSeven(i)) {
                continue;
            }
            count++;
        }

        System.out.println("Count of numbers without 7 from 1 to " + n + ": " + count);
    }

    private static boolean containsSeven(int num) {
        while (num > 0) {
            if (num % 10 == 7) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}