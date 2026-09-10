import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str2.charAt(i));
            } else {
                sb.append(str2.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

// 