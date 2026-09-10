import java.util.Arrays;

public class ThreeIncreasingAdjacentNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Check for three increasing adjacent numbers
        boolean found = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2]) {
                found = true;
                break;
            }
        }

        // Print the result
        System.out.println(found);
    }
}
