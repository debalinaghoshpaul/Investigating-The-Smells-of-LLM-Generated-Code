import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = str.substring(0, 2) + str.substring(str.length() - 2, str.length() - 1);
        System.out.println(newStr);
    }
}

