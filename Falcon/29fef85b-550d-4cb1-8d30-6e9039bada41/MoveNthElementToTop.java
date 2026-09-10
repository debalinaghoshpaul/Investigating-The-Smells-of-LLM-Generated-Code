import java.util.Stack;

public class MoveNthElementToTop {

    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push some elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Get the nth element from the top of the stack
        int n = 2;
        int nthElement = stack.get(stack.size() - n);

        // Remove the nth element from the stack
        stack.remove(stack.size() - n);

        // Push the nth element onto the top of the stack
        stack.push(nthElement);

        // Print the stack
        System.out.println(stack);
    }
}
