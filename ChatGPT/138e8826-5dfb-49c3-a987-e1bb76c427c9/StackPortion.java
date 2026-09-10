import java.util.Stack;

public class StackPortion {

    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();
        
        // Push elements to original stack
        originalStack.push(1);
        originalStack.push(2);
        originalStack.push(3);
        originalStack.push(4);
        originalStack.push(5);
        
        // Display original stack
        System.out.println("Original Stack: " + originalStack);
        
        // Create a new stack from a portion of the original stack (top 3 elements)
        for (int i = 0; i < 3; i++) {
            newStack.push(originalStack.pop());
        }
        
        // Display new stack
        System.out.println("New Stack: " + newStack);
    }
}
