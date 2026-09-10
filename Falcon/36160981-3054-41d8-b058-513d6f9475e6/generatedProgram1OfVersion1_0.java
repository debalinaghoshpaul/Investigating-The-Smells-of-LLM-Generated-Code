import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildcardMatch {
    public static void main(String[] args) {
        String str1 = "Hello*World";
        String str2 = "Hello*";

        Pattern pattern = Pattern.compile(".*");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

        Pattern pattern2 = Pattern.compile(".*");
        Matcher matcher2 = pattern2.matcher(str2);
        while (matcher2.find()) {
            System.out.println(matcher2.group(0));
        }
    }
}

