import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        int romanNum = scanner.nextInt();
        int intNum = 0;
        for (int i = 0; i < romanNum; i++) {
            intNum += Integer.parseInt(romanNum.substring(i, i + 1));
        }
        System.out.println("The Roman number is: " + romanNum);
        System.out.println("The integer number is: " + intNum);
    }
}

