import java.util.Scanner;

public class MaxRegions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of lines
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();

        // Calculating maximum number of regions
        int regions = (n * n + n + 2) / 2;

        System.out.println("Maximum number of regions achieved by drawing " + n + " lines is: " + regions);
    }
}
