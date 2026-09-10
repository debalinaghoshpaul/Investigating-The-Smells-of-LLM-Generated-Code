import java.util.Scanner;

public class LongestMirrorImage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Find the longest mirror image string at both ends of the given string
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                break;
            }
        }

        // Print the longest mirror image string
        System.out.println("The longest mirror image string is: " + str.substring(start, end + 1));
    }
}
