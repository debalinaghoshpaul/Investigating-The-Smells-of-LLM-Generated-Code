import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        List<Integer> evenNumbers = filterList(numbers, evenPredicate);
        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
    }
}