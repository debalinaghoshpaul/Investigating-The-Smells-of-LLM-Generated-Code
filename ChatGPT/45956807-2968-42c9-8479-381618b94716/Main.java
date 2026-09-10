
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Accepting a positive number from the user
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        
        int result = num;
        while(result > 9) {
            int sum = 0;
            while(result > 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }
        
        System.out.println("The final result is: " + result);
        
        input.close();
    }
}
