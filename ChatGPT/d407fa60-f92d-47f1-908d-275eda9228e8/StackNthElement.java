
public class StackNthElement {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        int n = 3; // Get the 3rd element from the bottom
        
        int element = getNthElementFromBottom(stack, n);
        
        System.out.println("The " + n + "th element from the bottom is: " + element);
    }
    
    public static int getNthElementFromBottom(Stack<Integer> stack, int n) {
        Stack<Integer> tempStack = new Stack<>();
        
        // Pop elements from the original stack and push them to a temporary stack
        while(!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        
        // Pop the nth element from the temporary stack
        int count = 1;
        int element = 0;
        while(!tempStack.isEmpty() && count <= n) {
            element = tempStack.pop();
            count++;
        }
        
        // Push elements back to the original stack
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        
        return element;
    }
}
