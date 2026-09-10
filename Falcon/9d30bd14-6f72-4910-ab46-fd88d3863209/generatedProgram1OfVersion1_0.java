import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 7!= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// 