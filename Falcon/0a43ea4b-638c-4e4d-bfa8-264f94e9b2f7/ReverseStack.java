import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Original Stack: " + stack);

		// Create a new stack to store the reversed elements
		Stack<Integer> reversedStack = new Stack<>();

		// Pop elements from the original stack and push them to the reversed stack
		while (!stack.isEmpty()) {
			reversedStack.push(stack.pop());
		}

		// Print the reversed stack
		System.out.println("Reversed Stack: " + reversedStack);
	}
}
