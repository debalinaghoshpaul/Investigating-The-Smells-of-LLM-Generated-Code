import java.util.Arrays;

public class MissingLetter {

    public static void main(String[] args) {
        char[] arr = {'p', 'r', 's', 't'};
        char missingLetter = findMissingLetter(arr);
        System.out.println("Missing letter: " + missingLetter);

        // Test cases
        char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'g', 'h', 'i'};
        System.out.println("Missing letter: " + findMissingLetter(arr1));

        char[] arr2 = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I'};
        System.out.println("Missing letter: " + findMissingLetter(arr2));

        char[] arr3 = {'z', 'y', 'x', 'w', 'v', 'u'};
        System.out.println("Missing letter: " + findMissingLetter(arr3));
    }

    public static char findMissingLetter(char[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff > 1) {
                return (char) (arr[i] + 1);
            }
        }

        return ' '; // No missing letter found
    }
}
