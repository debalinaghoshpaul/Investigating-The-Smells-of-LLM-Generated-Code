import java.util.function.Function;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        Function<String, String> concatenate = s -> str1 + " " + str2;
        String result = concatenate.apply(str1);

        System.out.println(result);
    }
}