import java.util.ArrayList;
import java.util.List;

public class ReverseOddLengthWords {
    public static void main(String[] args) {
        String str = "The quick brown fox";
        List<String> words = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                words.add(str.charAt(i)+"");
            }
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}

