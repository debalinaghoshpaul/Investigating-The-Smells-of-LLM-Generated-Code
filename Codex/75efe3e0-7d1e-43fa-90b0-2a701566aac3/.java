import java.util.ArrayList;
import java.util.LinkedList;

public class Set<T> {
    private ArrayList<LinkedList<T>> hashTable;
    private LinkedList<T> linkedList;

    public Set(int size) {
        hashTable = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            hashTable.add(new LinkedList<>());
        }
        linkedList = new LinkedList<>();
    }

    public void add(T item) {
        int hash = item.hashCode() % hashTable.size();
        if (!hashTable.get(hash).contains(item)) {
            hashTable.get(hash).add(item);
            linkedList.add(item);
        }
    }

    public boolean contains(T item) {
        int hash = item.hashCode() % hashTable.size();
        return hashTable.get(hash).contains(item);
    }

    public void remove(T item) {
        int hash = item.hashCode() % hashTable.size();
        hashTable.get(hash).remove(item);
        linkedList.remove(item);
    }

    public void clear() {
        for (LinkedList<T> list : hashTable) {
            list.clear();
        }
        linkedList.clear();
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
