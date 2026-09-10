import java.util.Stack;

public class StackSubset {
    
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(2);
        stack2.push(3);
        
        System.out.println("Is Stack 2 a subset of Stack 1? " + isSubset(stack1, stack2));
    }
    
    public static boolean isSubset(Stack<Integer> stack1, Stack<Integer> subset) {
        Stack<Integer> tempStack = new Stack<>();
        
        // Check if subset is empty
        if(subset.isEmpty()) {
            return true;
        }
        
        // Check if stack1 is empty
        if(stack1.isEmpty()) {
            return false;
        }
        
        // Pop elements from stack1 and check if they match elements in subset
        while(!stack1.isEmpty()) {
            int current = stack1.pop();
            tempStack.push(current);
            
            if(current == subset.peek()) {
                subset.pop();
                if(subset.isEmpty()) {
                    break;
                }
            }
        }
        
        // Restore stack1
        while(!tempStack.isEmpty()) {
            stack1.push(tempStack.pop());
        }
        
        return subset.isEmpty();
    }
}
