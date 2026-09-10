import java.util.Scanner;

public class CheckPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String prefix = sc.nextLine();

        if (str.length() > prefix.length()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == prefix.charAt(0)) {
                    for (int j = 1; j < str.length(); j++) {
                        if (str.charAt(j)!= prefix.charAt(0)) {
                            break;
                        }
                    }
                    if (j == str.length()) {
                        System.out.println("Yes");
                        break;
                    }
                }
            }
        }
    }
}

// 