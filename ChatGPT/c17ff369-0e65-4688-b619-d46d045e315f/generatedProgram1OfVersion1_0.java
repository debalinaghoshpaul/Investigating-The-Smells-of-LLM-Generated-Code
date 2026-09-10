import java.util.Stack;

public class StackChecker {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Check if all elements of the stack are even numbers
        boolean allEven = checkCondition(stack, element -> element % 2 == 0);
        
        if(allEven) {
            System.out.println("All elements of the stack are even numbers.");
        } else {
            System.out.println("Not all elements of the stack are even numbers.");
        }
    }
    
    public static boolean checkCondition(Stack<Integer> stack, Condition condition) {
        for(int element : stack) {
            if(!condition.evaluate(element)) {
                return false;
            }
        }
        return true;
    }
    
    interface Condition {
        boolean evaluate(int element);
    }

}
