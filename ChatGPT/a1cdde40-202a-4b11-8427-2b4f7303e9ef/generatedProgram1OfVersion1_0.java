import java.util.Stack;
import java.util.HashSet;

public class RemoveDuplicatesFromStack {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(1);
        originalStack.push(2);
        originalStack.push(3);
        originalStack.push(2);
        originalStack.push(1);

        Stack<Integer> newStack = removeDuplicates(originalStack);

        System.out.println("Original Stack: " + originalStack);
        System.out.println("Stack with Duplicates Removed: " + newStack);
    }

    public static Stack<Integer> removeDuplicates(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        while (!stack.isEmpty()) {
            int element = stack.pop();
            if (!set.contains(element)) {
                set.add(element);
                newStack.push(element);
            }
        }

        // Restoring the original order
        Stack<Integer> finalStack = new Stack<>();
        while (!newStack.isEmpty()) {
            finalStack.push(newStack.pop());
        }

        return finalStack;
    }
}
