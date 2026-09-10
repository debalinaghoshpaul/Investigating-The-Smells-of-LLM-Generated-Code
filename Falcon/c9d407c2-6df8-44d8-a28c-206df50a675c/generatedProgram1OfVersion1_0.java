import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = "p";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == pattern.charAt(0)) {
                if (str.charAt(i + 1)!= pattern.charAt(1)) {
                    result += str.charAt(i);
                    break;
                }
            } else {
                result += str.charAt(i);
                break;
            }
        }
        System.out.println(result);
    }
}

