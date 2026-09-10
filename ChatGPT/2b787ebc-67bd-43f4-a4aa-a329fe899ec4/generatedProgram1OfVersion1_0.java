import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int n = 3; // Replace with the desired value of n

        if (n <= stack.size()) {
            int element = stack.get(stack.size() - n);
            System.out.println("The " + n + "th element from the bottom is: " + element);
        } else {
            System.out.println("Invalid value of n");
        }
    }
}
