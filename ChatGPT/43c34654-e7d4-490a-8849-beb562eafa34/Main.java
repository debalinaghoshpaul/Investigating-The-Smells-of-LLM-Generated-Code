public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
    
    public static int sumOfDigits(int number) {
        if(number < 10) {
            return number;
        } else {
            return number % 10 + sumOfDigits(number / 10);
        }
    }
}
