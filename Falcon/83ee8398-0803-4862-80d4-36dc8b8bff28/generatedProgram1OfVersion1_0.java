import java.util.Scanner;

public class RoundUpDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = (int) Math.ceil(num);
        System.out.println("The rounded up result is: " + result);
    }
}

