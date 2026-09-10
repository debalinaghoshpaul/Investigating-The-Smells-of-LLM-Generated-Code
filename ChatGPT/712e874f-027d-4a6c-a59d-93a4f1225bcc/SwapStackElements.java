import java.util.Stack;

public class SwapStackElements {

    public static void swapTopTwoElements(Stack<Integer> stack) {
        if (stack.size() < 2) {
            System.out.println("Stack does not have enough elements to swap.");
            return;
        }

        int top1 = stack.pop();
        int top2 = stack.pop();

        stack.push(top1);
        stack.push(top2);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Before swapping:");
        System.out.println(stack);

        swapTopTwoElements(stack);

        System.out.println("After swapping:");
        System.out.println(stack);
    }
}
