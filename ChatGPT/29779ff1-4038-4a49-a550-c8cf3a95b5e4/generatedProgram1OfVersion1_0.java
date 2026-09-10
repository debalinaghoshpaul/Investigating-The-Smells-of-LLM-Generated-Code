import java.util.*;

class Stack {
    private List<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int num) {
        stack.add(num);
        System.out.println(num + " pushed into the stack.");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int popped = stack.remove(stack.size() - 1);
            System.out.println(popped + " popped from the stack.");
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top element of the stack: " + stack.top());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
