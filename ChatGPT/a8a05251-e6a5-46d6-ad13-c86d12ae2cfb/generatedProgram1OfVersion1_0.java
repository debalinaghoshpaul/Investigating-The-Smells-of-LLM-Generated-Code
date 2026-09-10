import java.util.Stack;

public class StackEquality {
    
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        
        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
        
        if (areStacksEqual(stack1, stack2)) {
            System.out.println("The stacks are equal.");
        } else {
            System.out.println("The stacks are not equal.");
        }
    }
    
    public static boolean areStacksEqual(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }
        
        for (int i = 0; i < stack1.size(); i++) {
            if (!stack1.get(i).equals(stack2.get(i))) {
                return false;
            }
        }
        
        return true;
    }
}
