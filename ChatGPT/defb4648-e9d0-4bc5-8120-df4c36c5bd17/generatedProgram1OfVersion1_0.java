import java.util.Scanner;

public class WordExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        
        String[] words = input.split("[^a-zA-Z0-9]");
        
        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                System.out.println(word);
            }
        }
    }
}
