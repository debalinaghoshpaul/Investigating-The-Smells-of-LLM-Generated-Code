import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
        }
        System.out.println("The number of characters (alphanumeric only) that occur more than twice in a given string is: " + count);
    }
}
