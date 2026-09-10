import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j == s) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

// 