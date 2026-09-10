import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

