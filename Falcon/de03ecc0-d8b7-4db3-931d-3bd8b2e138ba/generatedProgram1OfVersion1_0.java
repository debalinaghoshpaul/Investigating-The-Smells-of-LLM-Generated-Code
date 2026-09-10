import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int power = 1;
        while (num > 0) {
            power = power * 10;
            num--;
        }
        System.out.println("The power of " + num + " is " + power);
    }
}

