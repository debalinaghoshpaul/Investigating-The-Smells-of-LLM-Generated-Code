import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                continue;
            }
            if (Character.isLetter(sentence.charAt(i))) {
                words.add(sentence.substring(0, i));
            } else {
                words.add(sentence.substring(0, i));
                words.add(sentence.substring(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        System.out.println(sb.toString());
    }
}

