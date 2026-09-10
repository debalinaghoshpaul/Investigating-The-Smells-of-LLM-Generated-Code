import java.util.Arrays;
import java.util.List;

public class UniqueCombinations {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 4, 5};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(result, new ArrayList<>(), candidates, target, 0);

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    private static void findCombinations(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                findCombinations(result, tempList, candidates, remain - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
