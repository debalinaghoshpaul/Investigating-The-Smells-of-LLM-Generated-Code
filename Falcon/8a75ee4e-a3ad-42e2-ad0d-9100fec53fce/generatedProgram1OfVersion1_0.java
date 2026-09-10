import java.util.Scanner;

public class DebtAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The programming language you need to use is: ");
        String programmingLanguage = scanner.nextLine();
        System.out.print("Can you also add test cases including corner cases to test the program of the problem? (y/n): ");
        String testCases = scanner.nextLine();
        if (testCases.equalsIgnoreCase("y")) {
            System.out.print("Enter the number of months: ");
            int months = scanner.nextInt();
            double debtAmount = 0;
            for (int i = 0; i < months; i++) {
                debtAmount = debtAmount + (4 * 100000);
            }
            System.out.println("The debt amount is: " + debtAmount);
        } else {
            System.out.println("The programming language you need to use is: " + programmingLanguage);
        }
    }
}

// 