import java.util.regex.*;

public class CountVowels {

    public static int countVowels(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println("The number of vowels in '" + str1 + "' is: " + countVowels(str1)); // Output: 3

        String str2 = "The quick brown fox jumps over the lazy dog";
        System.out.println("The number of vowels in '" + str2 + "' is: " + countVowels(str2)); // Output: 15

        String str3 = "12345";
        System.out.println("The number of vowels in '" + str3 + "' is: " + countVowels(str3)); // Output: 0

        String str4 = "";
        System.out.println("The number of vowels in '" + str4 + "' is: " + countVowels(str4)); // Output: 0

        String str5 = "AEIOUaeiou";
        System.out.println("The number of vowels in '" + str5 + "' is: " + countVowels(str5)); // Output: 10
    }
}
