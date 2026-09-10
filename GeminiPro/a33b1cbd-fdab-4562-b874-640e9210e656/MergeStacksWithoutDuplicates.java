import java.util.Stack;

public class MergeStacksWithoutDuplicates {

    public static void main(String[] args) {
        // Create two stacks
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        // Create a new stack to store the merged elements without duplicates
        Stack<Integer> mergedStack = new Stack<>();

        // Push all elements from stack1 into the merged stack
        while (!stack1.isEmpty()) {
            mergedStack.push(stack1.pop());
        }

        // Push all elements from stack2 into the merged stack, but only if they are not already present
        while (!stack2.isEmpty()) {
            int element = stack2.pop();
            if (!mergedStack.contains(element)) {
                mergedStack.push(element);
            }
        }

        // Print the merged stack
        System.out.println(mergedStack);
    }
}
