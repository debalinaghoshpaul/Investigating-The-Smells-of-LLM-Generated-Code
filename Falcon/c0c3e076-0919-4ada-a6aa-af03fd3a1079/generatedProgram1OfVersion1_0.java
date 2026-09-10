import java.util.ArrayList;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        List<Integer> intervals = new ArrayList<>();
        intervals.add(1);
        intervals.add(6);
        intervals.add(8);
        intervals.add(10);
        intervals.add(15);
        intervals.add(20);
        System.out.println(mergeOverlappingIntervals(intervals));
    }

    public static List<Integer> mergeOverlappingIntervals(List<Integer> intervals) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i + 1; j < intervals.size(); j++) {
                if (intervals.get(i) <= intervals.get(j)) {
                    result.add(intervals.get(i));
                } else {
                    result.add(intervals.get(j));
                }
            }
        }
        return result;
    }
}

// 