import java.util.Stack;

public class MergeStacks {
    
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        
        mergeStacks(stack1, stack2);
        
        System.out.println("Merged Stack: " + stack1);
    }
    
    public static void mergeStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> tempStack = new Stack<>();
        
        while(!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }
        
        while(!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }
        
        while(!tempStack.isEmpty()) {
            stack1.push(tempStack.pop());
        }
    }
}
