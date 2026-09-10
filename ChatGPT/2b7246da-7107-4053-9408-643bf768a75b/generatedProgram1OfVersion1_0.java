import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        
        System.out.println("Enter six numbers: ");
        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);
        
        System.out.println("Numbers in descending order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
