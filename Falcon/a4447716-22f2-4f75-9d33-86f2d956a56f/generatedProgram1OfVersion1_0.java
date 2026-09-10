import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        char ch = str.charAt(index);
        System.out.println(ch);
    }
}

