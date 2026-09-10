import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long start = System.nanoTime();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        long end = System.nanoTime();
        System.out.println("Number of even elements: " + count);
        System.out.println("Time taken: " + (end - start) / 1000000000);
    }
}

