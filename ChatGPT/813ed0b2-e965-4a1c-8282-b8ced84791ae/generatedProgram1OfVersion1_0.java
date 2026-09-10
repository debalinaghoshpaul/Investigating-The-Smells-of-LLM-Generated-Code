import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumNumberInWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        int[] result = findMaxInWindow(arr, k);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] findMaxInWindow(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        
        int[] result = new int[arr.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            // Remove elements outside of the window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove elements smaller than the current element from the back of the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            
            deque.offer(i);
            
            if (i >= k - 1) {
                result[index++] = arr[deque.peek()];
            }
        }
        
        return result;
    }
}
