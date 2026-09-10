import java.util.Scanner;

public class SumNumericalValuesInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            // Split the line into words
            String[] words = line.split(" ");

            // Iterate over the words
            for (String word : words) {
                // Check if the word is a positive integer
                try {
                    int number = Integer.parseInt(word);
                    if (number > 0) {
                        sum += number;
                    }
                } catch (NumberFormatException e) {
                    // Ignore non-numerical words
                }
            }
        }

        // Print the sum
        System.out.println(sum);
    }
}
