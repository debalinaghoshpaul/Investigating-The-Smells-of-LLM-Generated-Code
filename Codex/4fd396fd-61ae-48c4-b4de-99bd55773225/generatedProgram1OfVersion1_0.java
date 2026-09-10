import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 1, 6};
        
        // Find the second largest element
        int secondLargest = Arrays.stream(array)
                .boxed()
                .sorted()
                .distinct()
                .skip(array.length - 2)
                .findFirst()
                .orElse(-1);
        
        // Find the second smallest element
        int secondSmallest = Arrays.stream(array)
                .boxed()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        
        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}