import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        String str = scanner.nextLine();
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        System.out.println("The length of the string is: " + length);
    }
}

// 