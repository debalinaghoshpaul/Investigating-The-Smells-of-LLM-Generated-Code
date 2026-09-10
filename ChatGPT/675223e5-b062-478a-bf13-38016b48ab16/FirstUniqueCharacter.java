import java.util.HashMap;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        // Create a HashMap to store the character counts
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Iterate over the string and update the character counts
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Iterate over the string again and find the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCounts.get(c) == 1) {
                // Print the index of the first unique character
                System.out.println("First unique character of the above: " + i);
                break;
            }
        }
    }
}
