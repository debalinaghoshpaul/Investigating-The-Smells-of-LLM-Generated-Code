import java.util.Stack;

public class StackRotation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        rotateLeft(stack);
        
        System.out.println("Stack after rotation:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    
    public static void rotateLeft(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }
        
        int firstElement = stack.pop();
        stack.add(0, firstElement);
    }
}
