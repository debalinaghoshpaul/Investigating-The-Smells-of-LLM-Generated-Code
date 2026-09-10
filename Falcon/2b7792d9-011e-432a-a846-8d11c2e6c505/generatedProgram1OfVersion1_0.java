import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = str.substring(1, str.length() - 1);
        System.out.println(result);
    }
}

