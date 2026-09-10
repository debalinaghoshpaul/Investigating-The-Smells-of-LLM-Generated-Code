import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        
        // Remove and return the first element
        int firstElement = linkedList.removeFirst();
        
        // Print the first element
        System.out.println("First Element: " + firstElement);
    }
}
