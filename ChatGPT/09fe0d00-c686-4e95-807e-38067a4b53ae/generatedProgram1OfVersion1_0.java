import java.util.*;

public class DuplicateNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the list of integers from the user
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter a list of integers, separated by spaces: ");
        String inputString = input.nextLine();
        String[] inputArray = inputString.split(" ");
        for (String s : inputArray) {
            try {
                int number = Integer.parseInt(s);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integers.");
                return;
            }
        }

        // Check for duplicate numbers
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                throw new IllegalArgumentException("Duplicate number found: " + number);
            }
        }

        // No duplicate numbers found
        System.out.println("No duplicate numbers found.");
    }
}
