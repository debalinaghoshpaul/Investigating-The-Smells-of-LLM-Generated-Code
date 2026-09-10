import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("GitHub");
        strings.add("Copilot");

        // Convert strings to uppercase
        List<String> uppercaseStrings = convertStrings(strings, s -> s.toUpperCase());
        System.out.println("Uppercase strings: " + uppercaseStrings);

        // Convert strings to lowercase
        List<String> lowercaseStrings = convertStrings(strings, s -> s.toLowerCase());
        System.out.println("Lowercase strings: " + lowercaseStrings);
    }

    public static List<String> convertStrings(List<String> strings, StringConverter converter) {
        List<String> convertedStrings = new ArrayList<>();
        for (String s : strings) {
            convertedStrings.add(converter.convert(s));
        }
        return convertedStrings;
    }

    interface StringConverter {
        String convert(String s);
    }
}
