import java.util.Scanner;

public class OddNumberException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("The number is odd.");
        }
    }

    public static void checkNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException();
        }
    }
}

class OddNumberException extends Exception {

    public OddNumberException() {
        super("The number is odd.");
    }
}
