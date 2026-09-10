import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.endsWith("2")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

// 