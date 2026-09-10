import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            result.add(str.substring(0, i) + str.substring(i + 1, str.length()));
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

// 