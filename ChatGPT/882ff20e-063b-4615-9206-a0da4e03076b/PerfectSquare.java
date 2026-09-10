
public class PerfectSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        if(isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        
        input.close();
    }
    
    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }

}
