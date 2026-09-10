import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("The area of the circle is: " + (Math.PI * radius * radius));
        System.out.println("The circumference of the circle is: " + (2 * Math.PI * radius));
    }
}

