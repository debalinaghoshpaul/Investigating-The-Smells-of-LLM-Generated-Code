import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}

// 