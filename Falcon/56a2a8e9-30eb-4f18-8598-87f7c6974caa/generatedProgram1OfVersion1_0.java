import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.length()!= str2.length()) {
            System.out.println("Strings are not isomorphic.");
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i)!= str2.charAt(i)) {
                    System.out.println("Strings are not isomorphic.");
                    break;
                }
            }
            System.out.println("Strings are isomorphic.");
        }
    }
}

// 