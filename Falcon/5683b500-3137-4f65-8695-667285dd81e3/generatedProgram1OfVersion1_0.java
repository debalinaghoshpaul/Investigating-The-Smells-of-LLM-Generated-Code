import java.util.Scanner;

public class InsertDash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result += "-";
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}

// 