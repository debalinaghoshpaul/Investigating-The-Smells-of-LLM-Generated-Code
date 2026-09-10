import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = str.length() - count; i < str.length(); i++) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}

// 