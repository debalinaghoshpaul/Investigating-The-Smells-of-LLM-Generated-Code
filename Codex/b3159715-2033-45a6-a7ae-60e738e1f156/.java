// Define a class named Exercise6.
public class Exercise6 {
    
    // Define a method 'findIndex' that searches for an integer 't' in an integer array 'my_array'.
    public static int findIndex(int[] my_array, int t) {
        // Check if the array is null and return -1 if it is.
        if (my_array == null)
            return -1;
        
        // Get the length of the array.
        int len = my_array.length;
        int i = 0;
        
        // Iterate through the elements in the array.
        while (i < len) {
            // Check if the current element is equal to 't' and return its index if found.
            if (my_array[i] == t)
                return i;
            else
                i = i + 1;
        }
        
        // If 't' is not found in the array, return -1.
        return -1;
    }
    
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare an integer array 'my_array' and initialize it with values.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        // Find and print the index position of value 25 in the array.
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        
        // Find and print the index position of value 77 in the array.
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }
}