public class Main {
    public static int extractFirstDigit(int number) {
        // Convert the number to a positive value
        number = Math.abs(number);
        
        // Extract the first digit
        while (number >= 10) {
            number /= 10;
        }
        
        return number;
    }

    public static void main(String[] args) {
        int number = -12345;
        int firstDigit = extractFirstDigit(number);
        System.out.println("The first digit of " + number + " is " + firstDigit);
    }
}