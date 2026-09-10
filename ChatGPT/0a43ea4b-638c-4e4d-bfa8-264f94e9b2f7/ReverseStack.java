
public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original Stack: " + stack);
        
        reverseStack(stack);
        
        System.out.println("Reversed Stack: " + stack);
    }
    
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }
    
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        
        int temp = stack.pop();
        insertAtBottom(stack, value);
        stack.push(temp);
    }
} 

Output:
Original Stack: [1, 2, 3, 4, 5]
Reversed Stack: [5, 4, 3, 2, 1]
