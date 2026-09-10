import java.util.Stack;

public class RemoveAllElementsFromStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("Original Stack: " + stack);
        
        removeAllElements(stack);
        
        System.out.println("Stack after removing all elements: " + stack);
    }
    
    public static void removeAllElements(Stack<Integer> stack) {
        stack.clear();
    }
}
