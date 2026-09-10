import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumSubsets {
    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if (i!= j) {
                    list.add(i);
                    list.add(j);
                }
            }
            result.add(list);
        }
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

