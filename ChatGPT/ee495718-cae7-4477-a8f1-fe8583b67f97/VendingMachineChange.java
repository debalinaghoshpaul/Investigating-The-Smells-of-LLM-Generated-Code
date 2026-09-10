
public class VendingMachineChange {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
        int price = input.nextInt();
        
        if (price < 25 || price > 100 || price % 5 != 0) {
            System.out.println("Invalid price. Please enter a valid price between 25 and 100 cents in 5-cent increments.");
            return;
        }
        
        int change = 100 - price;
        int quarters = change / 25;
        change = change % 25;
        int dimes = change / 10;
        change = change % 10;
        int nickels = change / 5;
        
        System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
        System.out.println("so your change is");
        System.out.println(quarters + " quarters,");
        System.out.println(dimes + " dimes, and");
        System.out.println(nickels + " nickel.");
        
        input.close();
    }
}
