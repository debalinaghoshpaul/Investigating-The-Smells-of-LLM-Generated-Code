import java.util.Scanner;

public class PenultimateWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String penultimateWord = words[words.length - 1];
        System.out.println(penultimateWord);
    }
}

