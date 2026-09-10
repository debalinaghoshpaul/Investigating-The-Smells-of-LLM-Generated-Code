
public class HammingWeight {
    
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int weight = hammingWeight(num);
        System.out.println("Hamming weight of the number is: " + weight);
        
        scanner.close();
    }
}