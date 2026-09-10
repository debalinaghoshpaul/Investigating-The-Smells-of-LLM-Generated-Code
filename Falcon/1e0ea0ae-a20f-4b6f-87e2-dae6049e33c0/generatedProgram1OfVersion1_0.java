import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumericCharacters {
    public static void main(String[] args) {
        String str = "This is a test string";
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        System.out.println(sb.toString());
    }
}

