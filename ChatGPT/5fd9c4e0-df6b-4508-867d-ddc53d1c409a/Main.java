import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int n = 3; // get the 3rd element from the top of the stack

        if (n <= stack.size()) {
            int element = stack.get(stack.size() - n);
            System.out.println("The " + n + "th element from the top of the stack is: " + element);
        } else {
            System.out.println("Invalid value of n.");
        }
    }
}
