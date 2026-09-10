import java.util.Stack;
import java.util.HashSet;

public class CommonElementsInStacks {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);

        findCommonElements(stack1, stack2);
    }

    public static void findCommonElements(Stack<Integer> stack1, Stack<Integer> stack2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : stack1) {
            set.add(num);
        }
        
        Stack<Integer> tempStack = new Stack<>();
        while (!stack2.isEmpty()) {
            int num = stack2.pop();
            if (set.contains(num)) {
                tempStack.push(num);
            }
        }

        System.out.println("Common elements in the two stacks are:");
        while (!tempStack.isEmpty()) {
            System.out.println(tempStack.pop());
        }
    }
}
