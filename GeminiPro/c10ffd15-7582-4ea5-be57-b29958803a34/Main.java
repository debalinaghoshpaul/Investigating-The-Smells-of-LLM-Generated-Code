import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        boolean consecutive = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                consecutive = true;
                break;
            }
        }

        if (consecutive) {
            System.out.println("There are two consecutive identical letters in the string.");
        } else {
            System.out.println("There are no two consecutive identical letters in the string.");
        }
    }
}
