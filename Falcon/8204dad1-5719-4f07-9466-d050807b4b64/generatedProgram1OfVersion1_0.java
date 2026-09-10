import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)!= ch) {
                break;
            }
        }
        if (i == str.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

