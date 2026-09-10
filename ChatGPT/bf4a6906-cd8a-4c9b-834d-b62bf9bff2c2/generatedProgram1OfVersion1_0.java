class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    private Node top;
    
    public MyStack() {
        this.top = null;
    }
    
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to stack");
    }
    
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            int data = top.data;
            top = top.next;
            System.out.println(data + " popped from stack");
        }
    }
    
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }
    
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            System.out.println("Stack elements are:");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        
        stack.pop();
        stack.display();
        
        stack.peek();
    }
}
