import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three side lengths: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c) {
            System.out.println("No");
        } else if (a + c > b) {
            System.out.println("No");
        } else if (b + c > a) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

// 