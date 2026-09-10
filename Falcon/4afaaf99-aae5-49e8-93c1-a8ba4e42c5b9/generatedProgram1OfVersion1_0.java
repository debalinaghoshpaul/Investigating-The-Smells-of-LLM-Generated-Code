// Java program to get the number of elements in a hash set

import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    // Create a hash set
    HashSet<String> hashSet = new HashSet<>();

    // Add some elements to the hash set
    hashSet.add("One");
    hashSet.add("Two");
    hashSet.add("Three");
    hashSet.add("Four");
    hashSet.add("Five");

    // Get the number of elements in the hash set
    int size = hashSet.size();

    // Print the number of elements in the hash set
    System.out.println("The number of elements in the hash set is: " + size);
  }
}
