import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print out the collection
        for (String color : colors) {
            System.out.println(color);
        }
    }
}