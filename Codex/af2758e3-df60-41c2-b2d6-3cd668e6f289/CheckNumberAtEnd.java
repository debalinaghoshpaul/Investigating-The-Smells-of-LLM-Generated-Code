import java.util.regex.*;

public class CheckNumberAtEnd {

    public static boolean checkNumberAtEnd(String str) {
        Pattern pattern = Pattern.compile(".*\\d+$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(checkNumberAtEnd("123")); // true
        System.out.println(checkNumberAtEnd("abc123")); // true
        System.out.println(checkNumberAtEnd("123abc")); // false
        System.out.println(checkNumberAtEnd("abc")); // false
        System.out.println(checkNumberAtEnd("")); // false
    }
}
