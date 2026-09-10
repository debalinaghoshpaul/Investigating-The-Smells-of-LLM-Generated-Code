import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(1);
        originalStack.push(2);
        originalStack.push(3);
        originalStack.push(4);
        originalStack.push(5);

        Stack<Integer> newStack = removeElements(originalStack);

        System.out.println("Original stack: " + originalStack);
        System.out.println("New stack: " + newStack);
    }

    public static Stack<Integer> removeElements(Stack<Integer> originalStack) {
        Stack<Integer> newStack = new Stack<>();
        
        while (!originalStack.isEmpty()) {
            int element = originalStack.pop();
            if (element % 2 != 0) { // condition to keep element in new stack
                newStack.push(element);
            }
        }

        // Reversing the new stack to maintain the original order of elements
        Stack<Integer> reverseStack = new Stack<>();
        while (!newStack.isEmpty()) {
            reverseStack.push(newStack.pop());
        }

        return reverseStack;
    }
}
