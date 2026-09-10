import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create the source ArrayList
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);

        // Create the destination ArrayList
        List<Integer> destinationList = new ArrayList<>();

        // Copy the elements from sourceList to destinationList
        for (Integer element : sourceList) {
            destinationList.add(element);
        }

        // Print the destinationList
        System.out.println("Destination List: " + destinationList);
    }
}