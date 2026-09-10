import java.util.Stack;

public class ElementPresentInStack {
    
    public static boolean isElementPresent(Stack<Integer> stack, int element) {
        return stack.contains(element);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        int searchElement = 20;
        
        if(isElementPresent(stack, searchElement)) {
            System.out.println("Element " + searchElement + " is present in the stack");
        } else {
            System.out.println("Element " + searchElement + " is not present in the stack");
        }
    }
}
