import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        if (str1.startsWith(str2)) {
            System.out.println("The programming language you need to use is: java.");
        } else {
            System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        }
    }
}

// 