import java.util.Arrays;
import java.util.Scanner;

public class IncreasingAdjacentNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the input array
    System.out.println("Enter the array of integers, separated by spaces:");
    int[] array = Arrays.stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    // Check if the array contains three increasing adjacent numbers
    boolean increasingAdjacentNumbers = false;
    for (int i = 0; i < array.length - 2; i++) {
      if (array[i] < array[i + 1] && array[i + 1] < array[i + 2]) {
        increasingAdjacentNumbers = true;
        break;
      }
    }

    // Print the result
    if (increasingAdjacentNumbers) {
      System.out.println("Yes, the array contains three increasing adjacent numbers.");
    } else {
      System.out.println("No, the array does not contain three increasing adjacent numbers.");
    }
  }
}
