import java.util.Scanner;

public class MersennePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6.28 (Mersenne prime) : ");
        int p = scanner.nextInt();
        if (p <= 31) {
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (p % i == 0) {
                    System.out.print(p + " ");
                }
            }
        } else {
            System.out.println(p);
        }
    }
}

