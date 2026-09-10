import java.util.ArrayList;
import java.util.List;

public class MaxDepth {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        int maxDepth = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)!= arr.get(i + 1)) {
                maxDepth++;
            }
        }
        System.out.println("The Maximum depth of the binary tree is: " + maxDepth);
    }
}

