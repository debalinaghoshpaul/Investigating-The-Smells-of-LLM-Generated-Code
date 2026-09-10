import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        
        // Print the list before emptying
        System.out.println("List before emptying: " + list);
        
        // Empty the list
        list.clear();
        
        // Print the list after emptying
        System.out.println("List after emptying: " + list);
    }
}
