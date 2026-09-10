import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divider = scanner.nextInt();
        double result = (double) dividend / (double) divider;
        System.out.println("Input the dividend: " + dividend + " Input the divider: " + divider + " Result: " + result);
    }
}

// 