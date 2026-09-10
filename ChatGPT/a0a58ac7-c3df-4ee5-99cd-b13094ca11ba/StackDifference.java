import java.util.Stack;
import java.util.HashSet;

public class StackDifference {
    
    public static Stack<Integer> findMissingElements(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> missingElements = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(Integer num : stack2) {
            set.add(num);
        }
        
        for(Integer num : stack1) {
            if(!set.contains(num)) {
                missingElements.push(num);
            }
        }
        
        return missingElements;
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        
        Stack<Integer> missingElements = findMissingElements(stack1, stack2);
        
        System.out.println("Elements in first stack but not in second stack:");
        while(!missingElements.isEmpty()) {
            System.out.println(missingElements.pop());
        }
    }
}
