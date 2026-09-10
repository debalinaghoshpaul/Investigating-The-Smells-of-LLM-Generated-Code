import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = "toast";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + pattern.length()).equals(pattern)) {
                result = str.substring(i, i + pattern.length());
                break;
            }
        }

        if (result.equals("")) {
            System.out.println("Empty string");
        } else {
            System.out.println(result);
        }
    }
}

