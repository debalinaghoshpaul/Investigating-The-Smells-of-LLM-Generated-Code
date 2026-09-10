import java.util.Scanner;

public class LastThreeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.substring(str.length() - 3, str.length()));
        System.out.println(str.substring(str.length() - 6, str.length()));
        System.out.println(str.substring(str.length() - 9, str.length()));
    }
}

// 