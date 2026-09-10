import java.util.Arrays;

public class FindMissingString {

    public static void main(String[] args) {
        // Test case 1: Find the missing string between "abc" and "bcd"
        String str1 = "abc";
        String str2 = "bcd";
        String missingString = findMissingString(str1, str2);
        System.out.println("Missing string between \"" + str1 + "\" and \"" + str2 + "\": " + missingString);

        // Test case 2: Find the missing string between "ab" and "cd"
        str1 = "ab";
        str2 = "cd";
        missingString = findMissingString(str1, str2);
        System.out.println("Missing string between \"" + str1 + "\" and \"" + str2 + "\": " + missingString);

        // Test case 3: Find the missing string between "a" and "z"
        str1 = "a";
        str2 = "z";
        missingString = findMissingString(str1, str2);
        System.out.println("Missing string between \"" + str1 + "\" and \"" + str2 + "\": " + missingString);

        // Test case 4: Find the missing string between "1" and "3"
        str1 = "1";
        str2 = "3";
        missingString = findMissingString(str1, str2);
        System.out.println("Missing string between \"" + str1 + "\" and \"" + str2 + "\": " + missingString);

        // Test case 5: Find the missing string between "a" and "a"
        str1 = "a";
        str2 = "a";
        missingString = findMissingString(str1, str2);
        System.out.println("Missing string between \"" + str1 + "\" and \"" + str2 + "\": " + missingString);
    }

   public static String findMissingString(String str1, String str2) {
        // Check if the strings are valid
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0 || str1.equals(str2)) {
            return null;
        }

        // Create an array to store the missing characters
        char[] missingChars = new char[str2.length() - str1.length()];

        // Find the missing characters
        int index = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int indexOfChInStr2 = str2.indexOf(ch, index);
            if (indexOfChInStr2 == -1) {
                missingChars[index++] = ch;
            } else {
                index = indexOfChInStr2 + 1;
            }
        }

        // Convert the missing characters to a string
        return new String(missingChars);
   }
}
