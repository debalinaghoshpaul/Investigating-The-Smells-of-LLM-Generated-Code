// Java program to calculate the area of a triangle

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the base and height of the triangle from the user.
        System.out.println("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Calculate the area of the triangle using the formula: area = (1/2) * base * height
        double area = 0.5 * base * height;

        // Print the area of the triangle to the console.
        System.out.println("The area of the triangle is: " + area);
    }
}
