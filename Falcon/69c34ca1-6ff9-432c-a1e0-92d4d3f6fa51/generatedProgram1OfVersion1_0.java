import java.util.ArrayList;
import java.util.List;

public class StringChecker {
    public static void main(String[] args) {
        String firstString = "hello";
        String secondString = "ello";

        List<Character> firstStringChars = new ArrayList<>();
        firstStringChars.add('h');
        firstStringChars.add('e');
        firstStringChars.add('l');

        List<Character> secondStringChars = new ArrayList<>();
        secondStringChars.add('e');
        secondStringChars.add('l');
        secondStringChars.add('o');

        if (firstStringChars.containsAll(secondStringChars)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

