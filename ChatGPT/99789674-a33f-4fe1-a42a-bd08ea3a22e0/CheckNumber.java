
public class CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        
        sc.close();
    }
} 

//Test Data Input number: 35
//Expected Output : Number is positive

//Output:
//Enter a number: 35
//Number is positive
