public class Main {
    public static void main(String[] args) {
        int number = 25;
        int sum = sumOfDigits(number);
        System.out.println("The sum is " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
