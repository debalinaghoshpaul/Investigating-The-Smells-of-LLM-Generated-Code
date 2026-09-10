import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

    public static void main(String[] args) {
        // Test case 1: Two arrays with some common elements
        String[] array1 = {"Apple", "Orange", "Banana", "Grape"};
        String[] array2 = {"Orange", "Strawberry", "Kiwi", "Grape"};
        Set<String> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements between array1 and array2: " + commonElements);

        // Test case 2: Two arrays with no common elements
        String[] array3 = {"Apple", "Orange", "Banana"};
        String[] array4 = {"Strawberry", "Kiwi", "Grape"};
        Set<String> commonElements2 = findCommonElements(array3, array4);
        System.out.println("Common elements between array3 and array4: " + commonElements2);

        // Test case 3: One of the arrays is empty
        String[] array5 = {};
        String[] array6 = {"Orange", "Strawberry", "Kiwi"};
        Set<String> commonElements3 = findCommonElements(array5, array6);
        System.out.println("Common elements between array5 and array6: " + commonElements3);

        // Test case 4: Both arrays are empty
        String[] array7 = {};
        String[] array8 = {};
        Set<String> commonElements4 = findCommonElements(array7, array8);
        System.out.println("Common elements between array7 and array8: " + commonElements4);
    }

    public static Set<String> findCommonElements(String[] array1, String[] array2) {
        // Convert the arrays to sets for efficient lookup
        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        // Find the intersection of the two sets to get the common elements
        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        return commonElements;
    }
}
