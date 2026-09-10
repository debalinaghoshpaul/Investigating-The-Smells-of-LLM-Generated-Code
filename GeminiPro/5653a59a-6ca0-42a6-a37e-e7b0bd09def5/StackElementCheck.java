import java.util.Stack;

public class StackElementCheck {

    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push some elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Check if an element is present in the stack
        int element = 3;
        boolean isPresent = stack.contains(element);

        // Print the result
        if (isPresent) {
            System.out.println("The element is present in the stack.");
        } else {
            System.out.println("The element is not present in the stack.");
        }
    }
}
