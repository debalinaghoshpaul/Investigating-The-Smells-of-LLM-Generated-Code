
public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int totalSum = calculateSubsetSum(n);
        
        System.out.println("The sum of elements from all possible subsets of first " + n + " natural numbers is: " + totalSum);
    }
    
    public static int calculateSubsetSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (1 << (n - 1));
        }
        return sum;
    }
}
