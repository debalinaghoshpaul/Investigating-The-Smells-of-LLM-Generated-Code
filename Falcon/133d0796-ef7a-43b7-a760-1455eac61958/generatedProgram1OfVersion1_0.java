import java.util.Scanner;

public class RemoveFirstTwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() > 0 && str.charAt(0) == 'a' || str.charAt(0) == 'A') {
            str = str.substring(1);
        }
        System.out.println(str);
    }
}

// 