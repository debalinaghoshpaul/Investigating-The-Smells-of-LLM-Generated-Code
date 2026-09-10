import java.util.Scanner;

public class CalculateDebt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();
        
        int debt = 100000;
        for (int i = 1; i <= months; i++) {
            debt += debt * 0.04; // add 4% interest
            debt = roundToNearestThousand(debt);
        }
        
        System.out.println("Debt amount after " + months + " months: $" + debt);
    }
    
    public static int roundToNearestThousand(int amount) {
        return (int) Math.round(amount / 1000) * 1000;
    }
}
