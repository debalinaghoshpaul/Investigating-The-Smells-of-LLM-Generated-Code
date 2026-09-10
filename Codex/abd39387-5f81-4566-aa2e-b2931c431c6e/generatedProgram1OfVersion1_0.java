import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at position " + i + ": " + list.get(i));
        }
    }
}