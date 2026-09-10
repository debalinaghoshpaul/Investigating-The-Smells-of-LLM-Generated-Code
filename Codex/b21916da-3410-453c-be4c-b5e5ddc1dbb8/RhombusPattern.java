import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (k + 64));
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char) (l + 64));
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (k + 64));
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char) (l + 64));
            }
            System.out.println();
        }
    }
}
