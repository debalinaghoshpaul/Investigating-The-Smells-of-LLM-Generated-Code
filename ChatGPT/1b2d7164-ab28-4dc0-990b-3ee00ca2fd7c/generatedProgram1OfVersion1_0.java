import java.util.Stack;

public class StackTopBottom {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        findTopElement(stack);
        findBottomElement(stack);
    }

    public static void findTopElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element of the stack is: " + stack.peek());
    }

    public static void findBottomElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int bottomElement = stack.get(0);
        for (int i = 1; i < stack.size(); i++) {
            bottomElement = stack.get(i);
        }

        System.out.println("Bottom element of the stack is: " + bottomElement);
    }
}
