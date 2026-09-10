import java.util.Scanner;

public class StartsWith {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a substring: ");
        String subStr = input.nextLine();

        if (str.startsWith(subStr)) {
            System.out.println("The string starts with the substring.");
        } else {
            System.out.println("The string does not start with the substring.");
        }
    }
}
