import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // Associate the specified value with the specified key
        hashMap.put("Name", "John Doe");

        // Get the value associated with the specified key
        String value = hashMap.get("Name");

        // Print the value
        System.out.println(value);
    }
}
