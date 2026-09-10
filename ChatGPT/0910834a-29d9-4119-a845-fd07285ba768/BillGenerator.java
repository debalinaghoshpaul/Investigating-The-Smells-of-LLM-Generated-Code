
public class BillGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[3];
        int[] quantities = new int[3];
        double[] prices = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Input name of item " + (i+1) + ":");
            names[i] = sc.nextLine();
            
            System.out.println("Input quantity of item " + (i+1) + ":");
            quantities[i] = sc.nextInt();
            
            System.out.println("Input price of item " + (i+1) + ":");
            prices[i] = sc.nextDouble();
            
            sc.nextLine(); // Consume the newline character
        }
        
        System.out.println("\nYour bill:\n");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "Item", "Quantity", "Price", "Total");
        
        double subtotal = 0.0;
        for (int i = 0; i < 3; i++) {
            double total = quantities[i] * prices[i];
            subtotal += total;
            System.out.printf("%-30s %-10d %-10.2f %-10.2f\n", names[i], quantities[i], prices[i], total);
        }
        
        double salesTax = subtotal * 0.0625;
        double total = subtotal + salesTax;
        
        System.out.printf("\n%-30s %-10.2f\n", "Subtotal", subtotal);
        System.out.printf("%-30s %-10.2f\n", "6.25% sales tax", salesTax);
        System.out.printf("%-30s %-10.2f\n", "Total", total);
        
        sc.close();
    }

}
