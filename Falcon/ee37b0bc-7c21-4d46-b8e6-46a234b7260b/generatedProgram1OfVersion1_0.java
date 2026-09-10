import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + j + " ");
                    count++;
                }
            }
            System.out.println();
        }
        if (count == n) {
            System.out.println("The pattern is a right angle triangle with a number which repeats a number in a row.");
        } else {
            System.out.println("The pattern is not a right angle triangle with a number which repeats a number in a row.");
        }
    }
}

// 