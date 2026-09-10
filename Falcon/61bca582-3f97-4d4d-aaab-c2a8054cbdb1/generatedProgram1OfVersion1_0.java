import java.util.Arrays;
import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 4, 5, 6};
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        int index = -1;
        while (start <= end) {
            sum += arr[start];
            if (sum == target) {
                index = start;
                break;
            }
            start++;
        }
        if (index == -1) {
            System.out.println(-1);
        } else {
            System.out.println(index);
        }
    }
}

// 