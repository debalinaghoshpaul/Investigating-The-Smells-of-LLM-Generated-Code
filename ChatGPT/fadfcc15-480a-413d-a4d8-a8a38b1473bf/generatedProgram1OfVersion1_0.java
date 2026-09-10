import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static List<String> generatePermutations(String input) {
        List<String> result = new ArrayList<>();

        if (input.length() == 1) {
            result.add(input);
        } else {
            for (int i = 0; i < input.length(); i++) {
                String firstChar = input.substring(i, i + 1);
                String restOfChars = input.substring(0, i) + input.substring(i + 1);
                List<String> subPermutations = generatePermutations(restOfChars);
                
                for (String subPerm : subPermutations) {
                    result.add(firstChar + subPerm);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        
        System.out.println("All possible permutations of the string '" + input + "': ");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
