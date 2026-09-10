import java.util.Stack;

public class SortStackDescending {

    public static void sortStackDescending(Stack<Integer> stack) {
        Stack<Integer> tmpStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() < temp) {
                stack.push(tmpStack.pop());
            }

            tmpStack.push(temp);
        }

        while (!tmpStack.isEmpty()) {
            stack.push(tmpStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Stack before sorting: " + stack);

        sortStackDescending(stack);

        System.out.println("Stack after sorting: " + stack);
    }
}
