import java.util.Scanner;

public class SummationSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.6 (Summation of a series)");
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10.");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The result of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 is: " + sum);
    }
}

