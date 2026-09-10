import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordInFile {

    public static void main(String[] args) {
        String longestWord = "";
        int maxLength = 0;

        try {
            Scanner scanner = new Scanner(new File("text.txt"));
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > maxLength) {
                    longestWord = word;
                    maxLength = word.length();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("The longest word in the file is: " + longestWord);
    }
}
