import java.util.Scanner;

public class CheckStringEndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.endsWith(str2)) {
            System.out.println(str1 + " ends with " + str2);
        } else {
            System.out.println(str1 + " does not end with " + str2);
        }
    }
}

// 