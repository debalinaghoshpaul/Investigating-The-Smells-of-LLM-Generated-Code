import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the temperature in Fahrenheit
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert the temperature to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
