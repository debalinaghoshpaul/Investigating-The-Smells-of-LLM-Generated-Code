import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Square: " + (num * num));
        System.out.println("Cube: " + (num * num * num));
        System.out.println("Fourth power: " + (num * num * num * num));
    }
}

// 