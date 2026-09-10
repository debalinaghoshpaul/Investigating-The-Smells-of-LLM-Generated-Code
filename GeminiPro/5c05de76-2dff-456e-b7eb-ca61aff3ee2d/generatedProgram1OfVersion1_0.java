import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            result += str.charAt(i);
        }
        System.out.println("The resulting string is: " + result);
    }
}
