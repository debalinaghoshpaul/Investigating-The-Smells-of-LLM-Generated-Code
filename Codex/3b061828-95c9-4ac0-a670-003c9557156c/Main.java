import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> colorsSet = new TreeSet<>();

        // Add colors to the TreeSet
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        colorsSet.add("Yellow");

        // Print out the TreeSet
        for (String color : colorsSet) {
            System.out.println(color);
        }
    }
}
