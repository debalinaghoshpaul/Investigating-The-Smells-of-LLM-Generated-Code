import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> keywords = Arrays.asList("apple", "banana", "cherry");
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (keywords.contains(word)) {
                result.add(word);
            }
        }
        System.out.println(result);
    }
}

// 