import java.util.*;

public class RearrangeAlphabets {

    public static void main(String[] args) {
        String input = "A1B2C3D4E5F6G7H8I9J0";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int sum = map.getOrDefault(c, 0) + Character.getNumericValue(c);
                map.put(c, sum);
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            output.append(entry.getKey());
        }

        System.out.println(output);
    }
}
