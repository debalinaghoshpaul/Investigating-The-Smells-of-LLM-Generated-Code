import java.util.Stack;
import java.util.HashSet;

public class MergeStacksWithoutDuplicates {

    public static Stack<Integer> mergeStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> resultStack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        
        while (!stack1.isEmpty()) {
            int element = stack1.pop();
            if (!set.contains(element)) {
                set.add(element);
                resultStack.push(element);
            }
        }
        
        while (!stack2.isEmpty()) {
            int element = stack2.pop();
            if (!set.contains(element)) {
                set.add(element);
                resultStack.push(element);
            }
        }
        
        return resultStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        
        Stack<Integer> mergedStack = mergeStacks(stack1, stack2);
        
        System.out.println("Merged Stack without duplicates: " + mergedStack);
    }
}
