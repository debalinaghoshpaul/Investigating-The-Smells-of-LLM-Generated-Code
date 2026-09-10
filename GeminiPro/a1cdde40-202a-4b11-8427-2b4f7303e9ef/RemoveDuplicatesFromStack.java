import java.util.Stack;

public class RemoveDuplicatesFromStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(1);

        System.out.println("Stack before removing duplicates: " + stack);

        removeDuplicates(stack);

        System.out.println("Stack after removing duplicates: " + stack);
    }

    private static void removeDuplicates(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int element = stack.pop();

            if (!tempStack.contains(element)) {
                tempStack.push(element);
            }
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
