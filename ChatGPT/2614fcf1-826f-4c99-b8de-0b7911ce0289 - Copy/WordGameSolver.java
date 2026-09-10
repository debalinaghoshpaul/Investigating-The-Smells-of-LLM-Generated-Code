import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordGameSolver {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String enteredWord = input.nextLine().toUpperCase();
            
            Map<Character, Integer> enteredWordMap = createLetterMap(enteredWord);
            
            File file = new File("words.txt");
            Scanner fileReader = new Scanner(file);
            
            while (fileReader.hasNextLine()) {
                String word = fileReader.nextLine().toUpperCase();
                if (canFormWord(enteredWordMap, word)) {
                    System.out.println(word);
                }
            }
            
            input.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static Map<Character, Integer> createLetterMap(String word) {
        Map<Character, Integer> letterMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
        }
        return letterMap;
    }
    
    public static boolean canFormWord(Map<Character, Integer> enteredWordMap, String word) {
        Map<Character, Integer> wordMap = createLetterMap(word);
        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (!enteredWordMap.containsKey(key) || enteredWordMap.get(key) < value) {
                return false;
            }
        }
        return true;
    }
}
