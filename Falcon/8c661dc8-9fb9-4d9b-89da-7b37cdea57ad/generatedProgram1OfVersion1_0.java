import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for inch: ");
        int inch = scanner.nextInt();
        double meters = (double) inch / 0.0254;
        System.out.println("One inch is " + meters + " meters.");
    }
}

