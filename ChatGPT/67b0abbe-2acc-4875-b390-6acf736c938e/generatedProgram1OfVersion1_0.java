import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceString {

    public static void main(String[] args) {
        String input = "The programming language you need to use is: java.\n\nCan you also generate test cases including corner cases to test the program?";
        String output = input.replaceAll("java", "python").replaceAll("python", "java");
        System.out.println(output);
    }
}
