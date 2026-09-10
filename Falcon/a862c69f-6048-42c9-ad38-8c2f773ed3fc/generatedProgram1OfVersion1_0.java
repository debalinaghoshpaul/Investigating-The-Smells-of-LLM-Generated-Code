import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String pattern = scanner.nextLine();

        if (pattern.isEmpty()) {
            System.out.println("Empty string");
        } else if (pattern.matches(input)) {
            System.out.println("Match found");
        } else if (pattern.contains(input)) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    }
}

// 