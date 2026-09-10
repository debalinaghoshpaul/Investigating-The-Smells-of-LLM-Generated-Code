import java.util.Arrays;

public class CheckValueAppearsThreeTimesNotAdjacent {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5, 20, 6, 7, 20, 8, 20, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 20, 6, 20, 7, 8, 20, 9, 10};
        int[] arr3 = {1, 2, 3, 4, 5, 20, 20, 6, 7, 8, 9, 10};
        int[] arr4 = {1, 2, 3, 4, 5};
        int[] arr5 = {20, 20, 20};

        // Expected outputs
        boolean expected1 = true;
        boolean expected2 = false;
        boolean expected3 = false;
        boolean expected4 = false;
        boolean expected5 = true;

        // Actual outputs
        boolean actual1 = checkValueAppearsThreeTimesNotAdjacent(arr1);
        boolean actual2 = checkValueAppearsThreeTimesNotAdjacent(arr2);
        boolean actual3 = checkValueAppearsThreeTimesNotAdjacent(arr3);
        boolean actual4 = checkValueAppearsThreeTimesNotAdjacent(arr4);
        boolean actual5 = checkValueAppearsThreeTimesNotAdjacent(arr5);

        // Assertions
        assert expected1 == actual1 : "Test case 1 failed";
        assert expected2 == actual2 : "Test case 2 failed";
        assert expected3 == actual3 : "Test case 3 failed";
        assert expected4 == actual4 : "Test case 4 failed";
        assert expected5 == actual5 : "Test case 5 failed";

        System.out.println("All test cases passed");
    }

    public static boolean checkValueAppearsThreeTimesNotAdjacent(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i + 1 < arr.length && arr[i + 1] == 20) {
                    return false;
                }
            }
        }
        return count == 3;
    }
}
