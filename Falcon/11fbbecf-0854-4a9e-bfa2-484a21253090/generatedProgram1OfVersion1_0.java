import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The programming language you need to use is: ");
        String language = scanner.nextLine();
        System.out.print("Can you also add test cases including corner cases to test the program of the problem? (y/n): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

