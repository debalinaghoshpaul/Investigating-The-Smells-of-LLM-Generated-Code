import java.util.Stack;

public class RemoveElementFromStack {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        int elementToRemove = 3;
        
        removeElement(stack, elementToRemove);
        
        System.out.println("Stack after removing element "+ elementToRemove + ":");
        System.out.println(stack);
    }
    
    public static void removeElement(Stack<Integer> stack, int element) {
        Stack<Integer> tempStack = new Stack<>();
        
        while(!stack.isEmpty()) {
            int current = stack.pop();
            if(current != element) {
                tempStack.push(current);
            }
        }
        
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
