import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String reversedSentence = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversedSentence += sentence.charAt(i);
        }
        System.out.println(reversedSentence);
    }
}

