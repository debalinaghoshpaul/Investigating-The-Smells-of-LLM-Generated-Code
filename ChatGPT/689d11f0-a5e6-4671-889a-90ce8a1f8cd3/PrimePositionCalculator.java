
public class PrimePositionCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the prime number: ");
        int primeNumber = input.nextInt();

        int count = 0;
        int position = 0;
        
        for (int num = 2; count < primeNumber; num++) {
            if (isPrime(num)) {
                count++;
                position = num;
            }
        }

        System.out.println("Position of the prime number " + primeNumber + " is: " + position);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
