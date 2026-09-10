import java.util.Scanner;

public class IntegerFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("The integer value is: " + num);
    }
}

