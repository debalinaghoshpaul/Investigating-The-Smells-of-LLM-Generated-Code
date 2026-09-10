import java.util.*;

public class SubsetSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Create a set of the first n natural numbers
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }

        // Get all possible subsets of the set
        List<Set<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            Set<Integer> subset = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(j + 1);
                }
            }
            subsets.add(subset);
        }

        // Sum the elements from all possible subsets of the set
        int sum = 0;
        for (Set<Integer> subset : subsets) {
            for (int element : subset) {
                sum += element;
            }
        }

        // Print the sum of the elements from all possible subsets of the set
        System.out.println("The sum of the elements from all possible subsets of the set is: " + sum);
    }
}
