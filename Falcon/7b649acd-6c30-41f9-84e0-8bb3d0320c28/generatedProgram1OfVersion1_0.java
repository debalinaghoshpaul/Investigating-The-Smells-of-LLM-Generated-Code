import java.util.Scanner;

public class CountDecimalPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int decimalPlaces = 0;
        while (number!= 0) {
            decimalPlaces++;
            number /= 10;
        }
        System.out.println("Number of decimal places: " + decimalPlaces);
    }
}

// 