import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 67};
        int first = arr[0];
        int last = arr[arr.length - 1];
        int middle = Arrays.stream(arr).filter(x -> x % 2 == 0).max().getAsInt();
        System.out.println("Largest element between first, last, and middle values: " + middle);
    }
}

