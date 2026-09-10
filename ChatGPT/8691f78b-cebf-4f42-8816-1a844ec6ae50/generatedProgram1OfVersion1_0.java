import java.util.Stack;

public class StackOperations {

    public static Stack<Integer> createCombinedStack(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> combinedStack = new Stack<>();

        while (!stack1.empty()) {
            int element = stack1.pop();
            if (!stack2.contains(element)) {
                combinedStack.push(element);
            }
        }

        while (!stack2.empty()) {
            int element = stack2.pop();
            if (!stack1.contains(element)) {
                combinedStack.push(element);
            }
        }

        return combinedStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        Stack<Integer> combinedStack = createCombinedStack(stack1, stack2);

        System.out.println("Combined Stack: " + combinedStack); // Output: Combined Stack: [6, 5, 2, 1]
    }
}
