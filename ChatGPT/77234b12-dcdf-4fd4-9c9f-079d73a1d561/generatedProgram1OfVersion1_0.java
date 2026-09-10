import java.util.Arrays;
import java.util.Scanner;

public class BoxOfProduce {
    private String[] items;

    public BoxOfProduce(String item1, String item2, String item3) {
        items = new String[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
    }

    public void printBox() {
        System.out.println("Items in the box:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    public void addItem(String newItem) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = newItem;
                break;
            }
        }
    }

    public void substituteItem(String newItem, int index) {
        if (index >= 0 && index < items.length) {
            items[index] = newItem;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public static void main(String[] args) {
        BoxOfProduce box = new BoxOfProduce("Apple", "Banana", "Orange");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Initial box:");
        box.printBox();

        System.out.print("Enter an item to add to the box: ");
        String newItem = scanner.nextLine();
        box.addItem(newItem);

        System.out.println("Box after adding item:");
        box.printBox();

        System.out.print("Enter the index of the item to substitute (0-2): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter the new item: ");
        String substitute = scanner.nextLine();
        box.substituteItem(substitute, index);

        System.out.println("Box after substitution:");
        box.printBox();

        scanner.close();
    }
}
