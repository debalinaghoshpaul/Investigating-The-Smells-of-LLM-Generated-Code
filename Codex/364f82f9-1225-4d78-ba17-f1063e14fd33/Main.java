// Import necessary Java classes.
import java.util.Scanner;
import java.util.Arrays;

// Define the 'Main' class.
public class Main {
  // Define the main method for running the program.
  public static void main(String[] args) {
    // Initialize an array of strings representing letters.
    // You can use one of these alternative 'str_arra' arrays by uncommenting them.
    // String[] str_arra = {"A", "B", "D", "E"};
    // String[] str_arra = {"a", "b", "c", "e"};
    String[] str_arra = {"p", "r", "s", "t"};
    System.out.printf("Original array of elements:\n" + Arrays.toString(str_arra));

    // Call the 'test' method to find the missing letter in the array.
    String result = test(str_arra);
    System.out.printf("\nMissing letter in the said array: " + result);
  }

  // Define the 'test' method to find the missing letter in the array.
  public static String test(String[] str_arra) {
    // Calculate the expected character code for the missing letter.
    int c = str_arra[0].charAt(0) + 1;
    
    // Iterate through the array and check for the missing letter.
    for (int i = 1; i < str_arra.length; i++, c++) {
      if (str_arra[i].charAt(0) != c) {
        return String.valueOf((char) c);
      }
    }
    
    // Return an empty string if no letter is missing.
    return "";
  }
}