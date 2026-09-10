import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}

// 