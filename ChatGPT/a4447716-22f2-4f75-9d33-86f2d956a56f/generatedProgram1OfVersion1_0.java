import java.util.Scanner;

public class GetCharAtIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter the index of the character you want to get: ");
        int index = input.nextInt();

        char character = str.charAt(index);

        System.out.println("The character at index " + index + " is: " + character);
    }

}
