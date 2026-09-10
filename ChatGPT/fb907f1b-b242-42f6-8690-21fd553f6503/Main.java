import java.util.*;

class Stack {
    private int top;
    private int[] stackArr;
    private int maxSize;

    public Stack(int size) {
        top = -1;
        maxSize = size;
        stackArr = new int[maxSize];
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArr[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void removeElements(int condition) {
        Stack tempStack = new Stack(maxSize);
        while (!isEmpty()) {
            int element = pop();
            if (element % condition == 0) {
                tempStack.push(element);
            }
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(4);
        stack.push(9);
        stack.push(6);
        stack.push(3);

        int condition = 2;

        System.out.println("Stack before removing elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.push(2);
        stack.push(4);
        stack.push(9);
        stack.push(6);
        stack.push(3);

        stack.removeElements(condition);

        System.out.println("\nStack after removing elements not divisible by " + condition + ":");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
