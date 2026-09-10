import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 4 || n > 50_000) {
            System.out.println("Invalid input");
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n + " is a Goldbach number");
            } else {
                System.out.println(n + " is not a Goldbach number");
            }
        }
    }
}

// 