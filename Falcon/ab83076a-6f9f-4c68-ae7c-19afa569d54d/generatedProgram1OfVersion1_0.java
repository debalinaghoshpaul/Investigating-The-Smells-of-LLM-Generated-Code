import java.util.Scanner;

public class CheckIfStringContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.contains(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

