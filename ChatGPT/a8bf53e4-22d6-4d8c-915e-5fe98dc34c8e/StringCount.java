import java.util.List;

public class StringCount {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "avocado", "grape", "kiwi");

        char specificLetter = 'a';

        long count = stringList.stream()
                .filter(s -> s.startsWith(String.valueOf(specificLetter)))
                .count();

        System.out.println("Number of strings starting with letter '" + specificLetter + "' : " + count);
    }
}
