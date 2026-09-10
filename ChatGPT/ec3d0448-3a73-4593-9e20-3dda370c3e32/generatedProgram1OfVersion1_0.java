public class ArrayContainsValue {

    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int valueToFind = 3;

        if (containsValue(arr, valueToFind)) {
            System.out.println("Array contains the value " + valueToFind);
        } else {
            System.out.println("Array does not contain the value " + valueToFind);
        }
    }
}
