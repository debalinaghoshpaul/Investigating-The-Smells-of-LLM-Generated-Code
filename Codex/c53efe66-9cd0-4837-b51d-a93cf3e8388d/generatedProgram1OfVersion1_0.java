import java.util.regex.*;

public class StringContainsOnlyDigits {

    public static void main(String[] args) {
        String str = "12345";
        boolean containsOnlyDigits = str.matches("[0-9]+");
        System.out.println(containsOnlyDigits); // true
    }
}
