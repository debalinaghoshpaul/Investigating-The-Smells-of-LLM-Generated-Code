import java.util.HashSet;

public class RemoveAllElementsFromHashSet {

    public static void main(String[] args) {
        // create a hash set
        HashSet<String> hashSet = new HashSet<>();

        // add some elements to the hash set
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        // print the hash set
        System.out.println("HashSet before removing all elements: " + hashSet);

        // remove all elements from the hash set
        hashSet.clear();

        // print the hash set
        System.out.println("HashSet after removing all elements: " + hashSet);
    }
}
