public class Main {
    public static boolean checkEvenDigits(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 2468;
        boolean result = checkEvenDigits(num);
        System.out.println(result);
    }
}