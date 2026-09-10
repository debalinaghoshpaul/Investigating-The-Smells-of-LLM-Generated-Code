import java.util.Stack;

public class MergeStacks {
    public static Stack<Integer> mergeStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> mergedStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        // Transfer elements from stack1 to the new stack without duplicates
        while (!stack1.isEmpty()) {
            int element = stack1.pop();
            if (!mergedStack.contains(element)) {
                mergedStack.push(element);
            }
            tempStack.push(element);
        }

        // Transfer elements from tempStack back to stack1
        while (!tempStack.isEmpty()) {
            stack1.push(tempStack.pop());
        }

        // Transfer elements from stack2 to the new stack without duplicates
        while (!stack2.isEmpty()) {
            int element = stack2.pop();
            if (!mergedStack.contains(element)) {
                mergedStack.push(element);
            }
            tempStack.push(element);
        }

        // Transfer elements from tempStack back to stack2
        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }

        return mergedStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        Stack<Integer> mergedStack = mergeStacks(stack1, stack2);

        System.out.println("Merged Stack without duplicates:");
        while (!mergedStack.isEmpty()) {
            System.out.println(mergedStack.pop());
        }
    }
}
