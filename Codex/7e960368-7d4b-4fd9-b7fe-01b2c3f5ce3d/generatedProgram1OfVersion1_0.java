import java.util.Stack;

public class SortStackDescending {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(7);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStackDescending(stack);

        System.out.println("Sorted Stack in Descending Order: " + stack);
    }

    public static void sortStackDescending(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStackDescending(stack);
            insertInSortedStack(stack, temp);
        }
    }

    public static void insertInSortedStack(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || temp >= stack.peek()) {
            stack.push(temp);
        } else {
            int popped = stack.pop();
            insertInSortedStack(stack, temp);
            stack.push(popped);
        }
    }
}
