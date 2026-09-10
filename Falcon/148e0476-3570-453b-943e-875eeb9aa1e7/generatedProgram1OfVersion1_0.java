import java.util.Arrays;
import java.util.Scanner;

public class LongestBitonicSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        int n = sc.nextInt();
        int start = 0;
        int end = n-1;
        int maxLength = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            maxLength = Math.max(maxLength, mid - start + 1);
        }
        System.out.println(maxLength);
    }
}

// 