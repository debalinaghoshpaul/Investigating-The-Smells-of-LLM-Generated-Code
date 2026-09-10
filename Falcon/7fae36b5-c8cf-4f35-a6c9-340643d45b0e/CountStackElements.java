import java.util.Stack;

public class CountStackElements {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Number of elements in the stack: " + stack.size());
    }
}
