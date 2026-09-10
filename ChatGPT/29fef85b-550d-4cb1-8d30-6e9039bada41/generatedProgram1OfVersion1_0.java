import java.util.Stack;

public class StackMoveNthElement {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int n = 3; // move the 3rd element from the top to the top

        System.out.println("Original stack: " + stack);
        moveNthElementToTop(stack, n);
        System.out.println("Stack after moving " + n + "th element to top: " + stack);
    }

    public static void moveNthElementToTop(Stack<Integer> stack, int n) {
        if (stack.size() < n) {
            System.out.println("Stack size is less than " + n);
            return;
        }

        Stack<Integer> tempStack = new Stack<>();
        int size = stack.size();

        // Pop elements from the original stack and push them to a temporary stack until the nth element
        for (int i = 0; i < n - 1; i++) {
            tempStack.push(stack.pop());
        }

        // Pop the nth element from the original stack
        int nthElement = stack.pop();

        // Pop elements from the temporary stack and push them back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        // Push the nth element to the top of the original stack
        stack.push(nthElement);

        // Push the remaining elements from the original stack to the temporary stack and then back to the original stack
        for (int i = 0; i < size - n - 1; i++) {
            tempStack.push(stack.pop());
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    } 
}
