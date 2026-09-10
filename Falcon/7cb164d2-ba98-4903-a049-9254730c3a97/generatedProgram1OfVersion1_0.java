import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "The programming language you need to use is: java.";
        List<String> words = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            words.add(str.substring(i, i + 1));
        }
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
    }
}

// 