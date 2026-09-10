import java.util.HashSet;

public class HashsetEmpty {

    public static void main(String[] args) {
        // create a hash set
        HashSet<String> mySet = new HashSet<>();

        // check if the hash set is empty
        if (mySet.isEmpty()) {
            System.out.println("The hash set is empty.");
        } else {
            System.out.println("The hash set is not empty.");
        }
    }
}
