import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.contains("pop")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

