import java.util.Scanner;

public class TaylorSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        double result = Math.exp(sum);
        System.out.println("The value of e raised to the power x is: " + result);
    }
}

