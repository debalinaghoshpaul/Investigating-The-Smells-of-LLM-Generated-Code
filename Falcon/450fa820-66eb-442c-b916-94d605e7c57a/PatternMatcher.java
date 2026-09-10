import java.util.Scanner;

public class PatternMatcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the pattern and the string to check
        System.out.println("Enter the pattern: ");
        String pattern = scanner.nextLine();
        System.out.println("Enter the string to check: ");
        String str = scanner.nextLine();

        // Check if the string follows the pattern
        boolean followsPattern = checkPattern(pattern, str);

        // Print the result
        if (followsPattern) {
            System.out.println("The string follows the pattern.");
        } else {
            System.out.println("The string does not follow the pattern.");
        }
    }

    private static boolean checkPattern(String pattern, String str) {
        // If the lengths of the pattern and the string are not equal, then the string cannot follow the pattern
        if (pattern.length() != str.length()) {
            return false;
        }

        // Create a map to store the mappings between characters in the pattern and characters in the string
        Map<Character, Character> mapping = new HashMap<>();

        // Iterate over the pattern and the string
        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            char strChar = str.charAt(i);

            // If the pattern character is not already mapped to a character in the string, then map it
            if (!mapping.containsKey(patternChar)) {
                mapping.put(patternChar, strChar);
            } 
            else if(mapping.get(patternChar)!=strChar)
            {
               return false;
            }

        }
     
       return  true;
   }
}
