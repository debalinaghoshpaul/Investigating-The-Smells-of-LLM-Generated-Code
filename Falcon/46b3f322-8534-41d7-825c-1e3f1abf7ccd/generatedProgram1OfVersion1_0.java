import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}

