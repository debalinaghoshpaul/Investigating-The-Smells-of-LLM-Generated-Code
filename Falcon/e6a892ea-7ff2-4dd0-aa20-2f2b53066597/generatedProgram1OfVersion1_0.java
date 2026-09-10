import java.util.Scanner;

public class CountSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                count++;
            }
        }
        System.out.println("The programming language you need to use is: java.");
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
    }
}

