import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0 && i % d == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// 