import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.matches("^[0-9]+$")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

