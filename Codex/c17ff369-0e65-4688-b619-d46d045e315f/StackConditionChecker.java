import java.util.Stack;

public class StackConditionChecker {

    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Check if all elements of the stack are greater than 0
        boolean allPositive = true;
        for (int element : stack) {
            if (element <= 0) {
                allPositive = false;
                break;
            }
        }

        // Print the result
        System.out.println("All elements of the stack are positive: " + allPositive);
    }
}
