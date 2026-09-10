import java.util.ArrayList;
import java.util.Comparator;

class PriorityQueue<T> {
    private ArrayList<T> queue;
    private ArrayList<Integer> priorities;

    public PriorityQueue() {
        queue = new ArrayList<>();
        priorities = new ArrayList<>();
    }

    public void add(T item, int priority) {
        queue.add(item);
        priorities.add(priority);
    }

    public T remove() {
        if (queue.isEmpty()) {
            return null;
        }

        int maxPriorityIndex = 0;
        for (int i = 1; i < priorities.size(); i++) {
            if (priorities.get(i) > priorities.get(maxPriorityIndex)) {
                maxPriorityIndex = i;
            }
        }

        T item = queue.remove(maxPriorityIndex);
        priorities.remove(maxPriorityIndex);
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("X", 10);
        q.add("Y", 1);
        q.add("Z", 3);

        System.out.println(q.remove()); // Returns X
        System.out.println(q.remove()); // Returns Z
        System.out.println(q.remove()); // Returns Y
    }
}
