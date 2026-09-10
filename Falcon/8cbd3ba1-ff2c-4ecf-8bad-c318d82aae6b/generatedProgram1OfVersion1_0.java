import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= str.charAt(i + 1)) {
                index = i;
                break;
            }
        }
        if (index!= -1) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}

// 