import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[50];
        int count = 0;

        System.out.println("Enter numbers (up to 50) or any character to stop:");

        while (scanner.hasNextInt() && count < 50) {
            numbers[count] = scanner.nextInt();
            count++;
        }

        int[] distinct = new int[count];
        int[] freq = new int[count];
        int distinctCount = 0;

        for (int i = 0; i < count; i++) {
            boolean found = false;
            for (int j = 0; j < distinctCount; j++) {
                if (numbers[i] == distinct[j]) {
                    freq[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                distinct[distinctCount] = numbers[i];
                freq[distinctCount] = 1;
                distinctCount++;
            }
        }

        // Sorting distinct elements in descending order
        for (int i = 0; i < distinctCount; i++) {
            for (int j = i + 1; j < distinctCount; j++) {
                if (distinct[i] < distinct[j]) {
                    int temp = distinct[i];
                    distinct[i] = distinct[j];
                    distinct[j] = temp;
                    temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;
                }
            }
        }

        System.out.println("N   Count");
        for (int i = 0; i < distinctCount; i++) {
            System.out.println(distinct[i] + "   " + freq[i]);
        }
    }
}
