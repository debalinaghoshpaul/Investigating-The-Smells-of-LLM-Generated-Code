import java.util.ArrayList;
import java.util.List;

public class CreateString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            result.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            result.add(str2.charAt(i));
        }
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        System.out.println(result);
    }
}

