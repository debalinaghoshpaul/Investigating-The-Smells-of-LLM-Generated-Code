import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 4, 17, 7, 25, 3, 100);
        int avg = arr.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Original Array: " + Arrays.toString(arr.toArray()));
        System.out.println("Average of the said array is: " + avg);
        System.out.println("The numbers in the said array that are greater than the average are: " + Arrays.toString(arr.stream().filter(x -> x > avg).toArray()));
    }
}

