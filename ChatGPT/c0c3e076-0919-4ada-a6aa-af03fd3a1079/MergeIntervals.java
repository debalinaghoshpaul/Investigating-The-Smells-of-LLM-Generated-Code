import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {
        // Test cases
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}, {20, 25}};
        int[][] intervals2 = {{1, 3}, {2, 4}, {5, 7}, {6, 8}, {10, 12}, {12, 15}};
        int[][] intervals3 = {{1, 4}, {2, 3}};

        // Merge the intervals and print the result
        System.out.println(Arrays.toString(mergeIntervals(intervals1))); // [1, 6, 8, 10, 15, 20]
        System.out.println(Arrays.toString(mergeIntervals(intervals2))); // [1, 4, 5, 8, 10, 15]
        System.out.println(Arrays.toString(mergeIntervals(intervals3))); // [1, 4]
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        // Sort the intervals by their starting points
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Create a stack to store the merged intervals
        Stack<int[]> stack = new Stack<>();

        // Push the first interval onto the stack
        stack.push(intervals[0]);

        // Iterate over the remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // Get the current interval
            int[] currentInterval = intervals[i];

            // Get the top interval from the stack
            int[] topInterval = stack.peek();

            // If the current interval overlaps with the top interval, merge them
            if (currentInterval[0] <= topInterval[1]) {
                topInterval[1] = Math.max(topInterval[1], currentInterval[1]);
            } else {
                // Otherwise, push the current interval onto the stack
                stack.push(currentInterval);
            }
        }

        // Convert the stack of merged intervals into an array and return it
        int[][] mergedIntervals = new int[stack.size()][2];
        for (int i = 0; i < stack.size(); i++) {
            mergedIntervals[i] = stack.pop();
        }

        return mergedIntervals;
    }
}
