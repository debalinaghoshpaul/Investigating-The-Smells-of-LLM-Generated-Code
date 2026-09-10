import java.util.List;

public class Main {
    public static <T> int findIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int target = 3;
        int index = findIndex(numbers, target);
        System.out.println("Index of " + target + ": " + index);
    }
}
