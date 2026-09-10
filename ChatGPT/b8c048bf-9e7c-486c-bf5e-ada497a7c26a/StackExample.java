import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        
        // Check if at least one element in the stack is greater than 10
        boolean atLeastOneElementGreaterThanTen = false;
        for(int i : stack) {
            if(i > 10) {
                atLeastOneElementGreaterThanTen = true;
                break;
            }
        }
        
        if(atLeastOneElementGreaterThanTen) {
            System.out.println("At least one element in the stack is greater than 10");
        } else {
            System.out.println("No element in the stack is greater than 10");
        }
    }

}
