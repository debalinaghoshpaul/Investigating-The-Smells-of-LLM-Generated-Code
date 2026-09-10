import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        if (word.contains("g")) {
            System.out.println("Word contains 'g'");
        } else {
            System.out.println("Word does not contain 'g'");
        }
    }
}

