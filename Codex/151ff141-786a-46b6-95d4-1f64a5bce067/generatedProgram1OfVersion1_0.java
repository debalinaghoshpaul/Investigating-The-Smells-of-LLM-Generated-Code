import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBox<T> {
    private List<T> items;
    private Random random;

    public RandomBox() {
        items = new ArrayList<>();
        random = new Random();
    }

    public void add(T item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = random.nextInt(items.size());
        return items.remove(index);
    }

    public static void main(String[] args) {
        RandomBox<String> nameBox = new RandomBox<>();
        nameBox.add("John");
        nameBox.add("Jane");
        nameBox.add("Alice");

        System.out.println("Is nameBox empty? " + nameBox.isEmpty());

        String randomName = nameBox.drawItem();
        System.out.println("Randomly drawn name: " + randomName);

        System.out.println("Is nameBox empty? " + nameBox.isEmpty());
    }
}