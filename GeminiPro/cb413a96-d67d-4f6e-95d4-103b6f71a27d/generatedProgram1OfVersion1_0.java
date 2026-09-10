import java.util.*;

public class FindAnagramIndices {

    public static void main(String[] args) {
        String text = "BACDGABCDA";
        String pattern = "ABCD";
        List<Integer> indices = findAnagramIndices(text, pattern);
        System.out.println("The start indices of the anagrams are: " + indices);
    }

    public static List<Integer> findAnagramIndices(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        if (n < m) {
            return indices;
        }
        int[] textFreq = new int[26];
        int[] patternFreq = new int[26];
        for (int i = 0; i < m; i++) {
            textFreq[text.charAt(i) - 'A']++;
            patternFreq[pattern.charAt(i) - 'A']++;
        }
        if (Arrays.equals(textFreq, patternFreq)) {
            indices.add(0);
        }
        for (int i = m; i < n; i++) {
            textFreq[text.charAt(i) - 'A']++;
            textFreq[text.charAt(i - m) - 'A']--;
            if (Arrays.equals(textFreq, patternFreq)) {
                indices.add(i - m + 1);
            }
        }
        return indices;
    }
}
