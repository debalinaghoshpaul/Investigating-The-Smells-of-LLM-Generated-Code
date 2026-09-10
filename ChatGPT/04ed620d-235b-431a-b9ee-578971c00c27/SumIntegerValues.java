import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumIntegerValues {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        // Read sentences until an empty line is encountered
        while (input.hasNextLine()) {
            String line = input.nextLine().trim();

            // Break the loop if an empty line is encountered
            if (line.isEmpty()) {
                break;
            }

            // Use regular expression to find all positive integers in the line
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(line);

            // Calculate the sum of all positive integers in the line
            while (matcher.find()) {
                int num = Integer.parseInt(matcher.group());
                if (num <= 10000) { // Check if the number is less than or equal to 10000
                    sum += num;
                }
            }
        }

        System.out.println("Sum of all positive integers in the sentences: " + sum);
    }
}
