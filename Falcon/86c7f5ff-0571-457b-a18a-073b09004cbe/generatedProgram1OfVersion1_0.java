import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String pattern = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isUpperCase(c) &&!Character.isLowerCase(c) &&!Character.isDigit(c) && c!= '_') {
                output += c;
            }
        }
        System.out.println(output);
    }
}

// 