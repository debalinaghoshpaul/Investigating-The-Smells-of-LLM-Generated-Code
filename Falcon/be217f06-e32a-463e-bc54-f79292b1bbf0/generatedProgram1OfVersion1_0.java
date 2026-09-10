import java.util.Scanner;

public class RemoveLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r') {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}

