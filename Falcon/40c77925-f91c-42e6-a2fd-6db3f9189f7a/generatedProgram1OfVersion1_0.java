import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The first n natural numbers are :");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("The Sum of Natural Number upto n terms :");
        System.out.println(sum);
    }
}

