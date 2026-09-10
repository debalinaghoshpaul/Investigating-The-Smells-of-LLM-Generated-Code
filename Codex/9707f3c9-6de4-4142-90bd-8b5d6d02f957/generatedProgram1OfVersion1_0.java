public class Main {
    public static void main(String[] args) {
        int number = 2;
        int count = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + count);
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 2) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}