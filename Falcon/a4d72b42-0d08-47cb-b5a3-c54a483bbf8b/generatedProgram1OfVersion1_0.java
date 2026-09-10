import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String charToRemove = scanner.nextLine();
        String newStr = str.replace(charToRemove, "");
        System.out.println(newStr);
    }
}

// 