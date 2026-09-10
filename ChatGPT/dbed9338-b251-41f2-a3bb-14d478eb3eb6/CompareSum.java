
public class CompareSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer (-2 to 2): ");
        int num1 = input.nextInt();
        while(num1 < -2 || num1 > 2) {
            System.out.println("Please enter a number between -2 and 2.");
            num1 = input.nextInt();
        }

        System.out.print("Enter the second integer (-2 to 2): ");
        int num2 = input.nextInt();
        while(num2 < -2 || num2 > 2) {
            System.out.println("Please enter a number between -2 and 2.");
            num2 = input.nextInt();
        }

        System.out.print("Enter the third integer (-2 to 2): ");
        int num3 = input.nextInt();
        while(num3 < -2 || num3 > 2) {
            System.out.println("Please enter a number between -2 and 2.");
            num3 = input.nextInt();
        }

        if(num1 + num2 > num3) {
            System.out.println("The sum of the first two integers is greater than the third integer.");
        } else {
            System.out.println("The sum of the first two integers is not greater than the third integer.");
        }

        input.close();
    }
}
