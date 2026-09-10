import java.util.Stack;

public class MaxMinStack {
    
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    
    public void push(int element) {
        stack.push(element);
        
        if(maxStack.isEmpty() || element >= maxStack.peek()) {
            maxStack.push(element);
        }
        
        if(minStack.isEmpty() || element <= minStack.peek()) {
            minStack.push(element);
        }
    }
    
    public int pop() {
        if(stack.isEmpty()) {
            return -1;
        }
        
        int popped = stack.pop();
        
        if(popped == maxStack.peek()) {
            maxStack.pop();
        }
        
        if(popped == minStack.peek()) {
            minStack.pop();
        }
        
        return popped;
    }
    
    public int getMax() {
        return maxStack.isEmpty() ? -1 : maxStack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
    
    public static void main(String[] args) {
        MaxMinStack stack = new MaxMinStack();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(7);
        
        System.out.println("Max element in stack: " + stack.getMax());
        System.out.println("Min element in stack: " + stack.getMin());
        
        stack.pop();
        System.out.println("Max element after pop: " + stack.getMax());
        System.out.println("Min element after pop: " + stack.getMin());
    }
}
