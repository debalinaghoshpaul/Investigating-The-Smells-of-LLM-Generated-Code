import java.util.Stack;

public class MergeTwoStacks {

    public static void main(String[] args) {
        // Create two stacks
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Push elements into stack1
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        // Push elements into stack2
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        // Merge stack2 into stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        // Print the merged stack
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }
}
