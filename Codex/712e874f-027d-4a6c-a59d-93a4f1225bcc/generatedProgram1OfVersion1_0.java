import java.util.Stack;

public class SwapTopTwoElementsOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stack: " + stack);

        // Swap the top two elements of the stack
        int temp = stack.pop();
        int top = stack.pop();
        stack.push(temp);
        stack.push(top);

        System.out.println("Stack after swapping the top two elements: " + stack);
    }
}
