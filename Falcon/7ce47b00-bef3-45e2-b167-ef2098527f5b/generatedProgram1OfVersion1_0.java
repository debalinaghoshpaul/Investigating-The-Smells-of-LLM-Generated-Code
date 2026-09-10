import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) % 2 == 0) {
                chars.add(str.charAt(i));
            }
        }
        String updatedStr = "";
        for (int i = 0; i < chars.size(); i++) {
            updatedStr += chars.get(i);
        }
        System.out.println(updatedStr);
    }
}

// 