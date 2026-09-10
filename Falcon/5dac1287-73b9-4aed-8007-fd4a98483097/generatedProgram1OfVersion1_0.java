import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int q = Integer.parseInt(scanner.nextLine());
        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = p; i <= n; i++) {
            for (int j = q; j <= n; j++) {
                for (int k = r; k <= n; k++) {
                    for (int l = s; l <= n; l++) {
                        if (i + j + k + l == n) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

// Sample 