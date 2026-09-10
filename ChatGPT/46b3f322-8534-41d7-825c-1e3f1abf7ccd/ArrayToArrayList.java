import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "grape", "kiwi"};

        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("Array converted to ArrayList: " + arrayList);
    }
}
