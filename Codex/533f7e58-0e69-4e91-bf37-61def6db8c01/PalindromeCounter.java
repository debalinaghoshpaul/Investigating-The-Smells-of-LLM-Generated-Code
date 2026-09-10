import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeCounter {
    public static void main(String[] args) {
        String fileName = "C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/WordBuff.txt";
        int palindromeCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                for (String word : words) {
                    if (isPalindrome(word.trim())) {
                        palindromeCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of palindromes: " + palindromeCount);
    }

    private static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equalsIgnoreCase(reversed.toString());
    }
}
