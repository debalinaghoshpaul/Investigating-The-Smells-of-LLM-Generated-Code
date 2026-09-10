import java.util.ArrayList;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // create an array list
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // remove the third element from the array list
        colors.remove(2);

        // print the array list
        System.out.println(colors);
    }
}
