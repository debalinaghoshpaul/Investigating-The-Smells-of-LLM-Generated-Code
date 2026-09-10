import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "GitHub", "Copilot");

        double averageLength = strings.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        System.out.println("Average length of strings: " + averageLength);
    }
}