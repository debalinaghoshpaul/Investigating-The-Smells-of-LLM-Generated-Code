import java.util.Stack;

public class RotateStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        rotateStack(stack, 2);
        System.out.println("Rotated Stack: " + stack);
    }

    public static void rotateStack(Stack<Integer> stack, int n) {
        if (n <= 0 || n > stack.size()) {
            return;
        }

        for (int i = 0; i < n; i++) {
            int top = stack.pop();
            stack.push(top);
        }
    }
}
