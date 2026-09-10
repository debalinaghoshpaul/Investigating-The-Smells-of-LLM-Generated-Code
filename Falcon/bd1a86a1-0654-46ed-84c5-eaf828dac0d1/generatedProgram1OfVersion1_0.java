import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,5,6};
        int target = 6;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                sum += arr[i];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
// 