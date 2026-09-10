import java.util.ArrayList;
import java.util.List;

public class PermutationsWithRepetition {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = new ArrayList<>();
        permutationsWithRepetition(str, "", permutations);
        System.out.println(permutations);
    }

    private static void permutationsWithRepetition(String str, String prefix, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permutationsWithRepetition(remaining, prefix + c, permutations);
        }
    }
}
