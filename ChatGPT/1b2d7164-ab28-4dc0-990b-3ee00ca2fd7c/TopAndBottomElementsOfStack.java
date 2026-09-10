import java.util.Stack;

public class TopAndBottomElementsOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Bottom element of the stack: " + stack.lastElement());
    }
}
