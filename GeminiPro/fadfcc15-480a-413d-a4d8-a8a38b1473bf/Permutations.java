import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<String> permute(String s) {
        List<String> permutations = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return permutations;
        }

        if (s.length() == 1) {
            permutations.add(s);
            return permutations;
        }

        char first = s.charAt(0);
        String remaining = s.substring(1);
        List<String> permutes = permute(remaining);
        for (String perm : permutes) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPerm = perm.substring(0, i) + first + perm.substring(i);
                permutations.add(newPerm);
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        String s = "ABC";
        List<String> permutations = permute(s);
        System.out.println(permutations);
    }
}
