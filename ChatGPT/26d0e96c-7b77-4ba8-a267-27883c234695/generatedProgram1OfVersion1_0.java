import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the three numbers from the user
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3.0;

        // Print the average
        System.out.println("The average of the three numbers is: " + average);

        // Get the width and height of the rectangle
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Calculate the area and perimeter of the rectangle
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Print the area and perimeter of the rectangle
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
