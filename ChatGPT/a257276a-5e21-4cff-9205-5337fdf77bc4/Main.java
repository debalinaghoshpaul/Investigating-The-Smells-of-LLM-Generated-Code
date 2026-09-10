import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        
        boolean found = false;
        
        for (int x = 0; x <= Math.sqrt(num); x++) {
            for (int y = 0; y <= Math.sqrt(num); y++) {
                if ((x*x + y*y) == num) {
                    System.out.println("The two integers are: " + x + " and " + y);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("No such integers found.");
        }
    }
}
