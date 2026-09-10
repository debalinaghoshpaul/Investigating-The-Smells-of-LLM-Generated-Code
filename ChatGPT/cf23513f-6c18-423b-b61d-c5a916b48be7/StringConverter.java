import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "world", "java", "programming");

        System.out.println("Original List: " + stringList);

        List<String> upperCaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("List converted to Uppercase: " + upperCaseList);

        List<String> lowerCaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("List converted to Lowercase: " + lowerCaseList);
    }
}
