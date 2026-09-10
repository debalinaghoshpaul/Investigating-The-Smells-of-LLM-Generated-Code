
public class SeparateWords {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter a string containing three words separated by commas
        System.out.print("Enter three words separated by commas: ");
        String words = input.nextLine();
        
        // Split the input string by commas
        String[] wordArray = words.split(",");
        
        // Output each word in a different line
        for (String word : wordArray) {
            System.out.println(word.trim()); // Trim to remove any leading or trailing spaces
        }
        
        // Close the input scanner
        input.close();
    }
} 

//Output
//Enter three words separated by commas: Apple, Banana, Orange
//Apple
//Banana
//Orange
