import java.util.Arrays;

public class TestFirstLastElementEquality {

    public static void main(String[] args) {
        // Test data
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};

        // Check if the first and last elements of the arrays are the same
        boolean isEqual = array1[0] == array1[array1.length - 1] && array2[0] == array2[array2.length - 1];

        // Print the result
        System.out.println(isEqual);

        // Generate test cases including corner cases

        // Case 1: Arrays of different lengths
        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5};
        boolean isEqual1 = array3[0] == array3[array3.length - 1] && array4[0] == array4[array4.length - 1];
        System.out.println(isEqual1); // false

        // Case 2: Arrays with only one element
        int[] array5 = {1};
        int[] array6 = {2};
        boolean isEqual2 = array5[0] == array5[array5.length - 1] && array6[0] == array6[array6.length - 1];
        System.out.println(isEqual2); // false

        // Case 3: Arrays with the same first and last elements
        int[] array7 = {1, 2, 3, 1};
        int[] array8 = {4, 5, 6, 4};
        boolean isEqual3 = array7[0] == array7[array7.length - 1] && array8[0] == array8[array8.length - 1];
        System.out.println(isEqual3); // true

        // Case 4: Arrays with different first and last elements
        int[] array9 = {1, 2, 3, 4};
        int[] array10 = {5, 6, 7, 8};
        boolean isEqual4 = array9[0] == array9[array9.length - 1] && array10[0] == array10[array10.length - 1];
        System.out.println(isEqual4); // false

        // Case 5: Arrays with null values
        int[] array11 = null;
        int[] array12 = null;
        boolean isEqual5 = array11[0] == array11[array11.length - 1] && array12[0] == array12[array12.length - 1];
        System.out.println(isEqual5); // false
    }
}
