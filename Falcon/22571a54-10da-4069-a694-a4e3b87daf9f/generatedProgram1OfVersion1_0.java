import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.endsWith("m") || word.endsWith("n")) {
                count++;
            }
        }
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        System.out.println(count);
    }
}

// 