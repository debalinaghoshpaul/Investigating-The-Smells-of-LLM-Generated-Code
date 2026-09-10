import java.util.Stack;

public class CountStackElements {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Pushing elements to the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        
        // Counting all elements in the stack
        int count = 0;
        for(int i : stack) {
            count++;
        }
        
        System.out.println("Total elements in the stack: " + count);
    }
}
