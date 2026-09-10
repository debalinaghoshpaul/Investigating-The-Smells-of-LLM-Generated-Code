import java.util.HashSet;

public class EmptyHashSet {

    public static void main(String[] args) {
        // create a hash set
        HashSet<String> hashSet = new HashSet<>();

        // add some elements to the hash set
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");

        // print the hash set
        System.out.println(hashSet);

        // empty the hash set
        hashSet.clear();

        // print the hash set
        System.out.println(hashSet);
    }
}
