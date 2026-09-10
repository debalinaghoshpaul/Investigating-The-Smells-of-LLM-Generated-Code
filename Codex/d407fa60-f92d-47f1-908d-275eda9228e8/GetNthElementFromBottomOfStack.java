import java.util.Stack;

public class GetNthElementFromBottomOfStack {

    public static void main(String[] args) {
        // create a stack
        Stack<Integer> stack = new Stack<>();

        // push some elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // get the nth element from the bottom of the stack
        int n = 3;
        int nthElement = stack.get(stack.size() - n);

        // print the nth element
        System.out.println("The " + n + "th element from the bottom of the stack is: " + nthElement);
    }
}
