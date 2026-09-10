import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double num = scanner.nextDouble();
        System.out.println("Whole part: " + getWholePart(num));
        System.out.println("Fractional part: " + getFractionalPart(num));
    }

    public static double getWholePart(double num) {
        return num;
    }

    public static double getFractionalPart(double num) {
        return num - getWholePart(num);
    }
}

// 