import java.util.*;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store the numbers
        int[] numbers = new int[50];

        // Read numbers from the keyboard
        int count = 0;
        while (count < numbers.length && input.hasNextInt()) {
            numbers[count] = input.nextInt();
            count++;
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Create a map to store the count of each number
        Map<Integer, Integer> counts = new HashMap<>();
        for (int number : numbers) {
            if (!counts.containsKey(number)) {
                counts.put(number, 0);
            }
            counts.put(number, counts.get(number) + 1);
        }

        // Print the list of distinct numbers and their counts
        System.out.println("N\tCount");
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
