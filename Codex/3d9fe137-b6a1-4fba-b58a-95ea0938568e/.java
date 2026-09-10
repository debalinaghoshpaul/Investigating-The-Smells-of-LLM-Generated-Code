import java.util.Iterator;
import java.util.HashSet;

public class SetExample<T> implements Iterable<T> {
    private HashSet<T> set;

    public SetExample() {
        set = new HashSet<>();
    }

    public boolean add(T item) {
        return set.add(item);
    }

    public boolean remove(T item) {
        return set.remove(item);
    }

    public SetExample<T> union(SetExample<T> otherSet) {
        SetExample<T> resultSet = new SetExample<>();
        resultSet.set.addAll(this.set);
        resultSet.set.addAll(otherSet.set);
        return resultSet;
    }

    public SetExample<T> intersection(SetExample<T> otherSet) {
        SetExample<T> resultSet = new SetExample<>();
        for (T item : this.set) {
            if (otherSet.set.contains(item)) {
                resultSet.add(item);
            }
        }
        return resultSet;
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }

    public static void main(String[] args) {
        SetExample<String> set = new SetExample<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        System.out.println("Set elements:");
        for (String item : set) {
            System.out.println(item);
        }

        set.remove("banana");

        System.out.println("Set elements after removing 'banana':");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
