import java.util.Scanner;

public class FirstOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = scanner.nextLine();

        System.out.print("Input a substring to search for: ");
        String substring = scanner.nextLine();

        int index = str.indexOf(substring);

        if (index != -1) {
            System.out.println("First occurrence of " + substring + " in " + str + " is at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
