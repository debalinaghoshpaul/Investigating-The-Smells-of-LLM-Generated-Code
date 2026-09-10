import java.util.Arrays;
import java.util.Scanner;

public class RotationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!= arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// 