import java.util.Scanner;

public class CheckRotation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String str1 = scanner.nextLine();
    System.out.println("Enter the second string: ");
    String str2 = scanner.nextLine();

    // Check if the length of the two strings is equal.
    if (str1.length() != str2.length()) {
      System.out.println("The two strings are not rotations of each other.");
      return;
    }

    // Create a new string by concatenating the first string with itself.
    String str1Concat = str1 + str1;

    // Check if the second string is a substring of the concatenated string.
    if (str1Concat.contains(str2)) {
      System.out.println("The two strings are rotations of each other.");
    } else {
      System.out.println("The two strings are not rotations of each other.");
    }
  }
}
