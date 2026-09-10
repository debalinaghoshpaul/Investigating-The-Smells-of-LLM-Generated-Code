import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String wordToRemove = scanner.nextLine();
        String updatedText = text.replace(wordToRemove, "");
        System.out.println(updatedText);
    }
}

// 