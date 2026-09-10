import java.util.*;
import java.lang.*;

public class SmallestWindow {
    public static void main(String[] args) {
        String str = "this is a test string";
        String pat = "tist";

        int[] freq = new int[256];
        for (int i = 0; i < pat.length(); i++) {
            freq[pat.charAt(i)]++;
        }

        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;

        while (end < str.length()) {
            if (freq[str.charAt(end)] > 0) {
                count++;
            }
            freq[str.charAt(end)]--;
            end++;

            while (count == pat.length()) {
                if (end - start < minLen) {
                    minLen = end - start;
                }

                if (freq[str.charAt(start)] == 0) {
                    count--;
                }
                freq[str.charAt(start)]++;
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("No window found");
        } else {
            System.out.println("Smallest window: " + str.substring(start, start + minLen));
        }
    }
}
