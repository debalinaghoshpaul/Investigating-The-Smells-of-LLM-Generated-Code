import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String trimmedStr = str.trim();
        System.out.println("The programming language you need to use is: " + str);
        System.out.println("Can you also add test cases including corner cases to test the program of the problem?");
        System.out.println("The trimmed string is: " + trimmedStr);
    }
}

// 