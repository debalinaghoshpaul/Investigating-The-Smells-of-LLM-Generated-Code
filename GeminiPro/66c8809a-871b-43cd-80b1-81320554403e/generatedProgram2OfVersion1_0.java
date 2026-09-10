import java.util.Arrays;

public class StringPermutation {

    public static boolean isPermutation(String str1, String str2) {
        // Check if the strings are the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort both strings
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        // Check if the sorted strings are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "xxyz";
        String str2 = "yxzx";
        boolean result = isPermutation(str1, str2);
        System.out.println("Original strings: " + str1 + " " + str2);
        System.out.println("Permutation: " + result);
    }
}
