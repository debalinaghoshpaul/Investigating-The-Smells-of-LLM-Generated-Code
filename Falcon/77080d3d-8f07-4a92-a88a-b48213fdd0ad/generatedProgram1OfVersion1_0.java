import java.util.ArrayList;
import java.util.List;

public class PrintCharacters {
    public static void main(String[] args) {
        String word = "java";
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            characters.add(word.charAt(i));
        }
        for (int i = 0; i < characters.size(); i++) {
            System.out.print(characters.get(i) + " ");
        }
        System.out.println();
    }
}

