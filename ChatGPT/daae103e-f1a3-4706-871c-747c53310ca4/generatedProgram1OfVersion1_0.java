
public class StackRotation {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stack: " + stack);

        rotateStack(stack, 2);

        System.out.println("Rotated stack: " + stack);
    }

    public static void rotateStack(Stack<Integer> stack, int k) {
        if (stack.isEmpty() || k < 0) {
            return;
        }

        int n = stack.size();

        k = k % n;

        for (int i = 0; i < k; i++) {
            int temp = stack.pop();
            stack.insertElementAt(temp, n - 1);
        }
    }
}