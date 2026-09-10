import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.charAt(0) == 'g' && str.charAt(1) == 'h') {
            System.out.println(str.substring(2));
        } else {
            System.out.println(str);
        }
    }
}

// 