import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);

        // Clone the source ArrayList to another ArrayList
        ArrayList<Integer> clonedList = new ArrayList<>(sourceList);

        // Print the cloned ArrayList
        System.out.println("Cloned ArrayList: " + clonedList);
    }
}
