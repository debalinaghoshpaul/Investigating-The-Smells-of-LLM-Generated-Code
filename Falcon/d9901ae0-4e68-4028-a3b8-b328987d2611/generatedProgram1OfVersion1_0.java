import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0, right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                left++;
            } else if (arr[i] == 1) {
                right++;
            }
        }
        System.out.println(left + " " + right);
    }
}

// 