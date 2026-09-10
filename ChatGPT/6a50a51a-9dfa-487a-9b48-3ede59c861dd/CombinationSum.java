import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        System.out.println("Input number of elements of the array: ");
        int n = scanner.nextInt();

        int[] candidates = new int[n];
        System.out.println("Input number format: ");
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        System.out.println("Input target number: ");
        int target = scanner.nextInt();

        // Find all unique combinations
        List<List<Integer>> combinations = combinationSum(candidates, target);

        // Print the combinations
        System.out.println("Combinations: ");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        combinationSum(candidates, target, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void combinationSum(int[] candidates, int target, int index, List<Integer> combination, List<List<Integer>> combinations) {
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0 || index >= candidates.length) {
            return;
        }

        combination.add(candidates[index]);
        combinationSum(candidates, target - candidates[index], index, combination, combinations);
        combination.remove(combination.size() - 1);
        combinationSum(candidates, target, index + 1, combination, combinations);
    }
}
