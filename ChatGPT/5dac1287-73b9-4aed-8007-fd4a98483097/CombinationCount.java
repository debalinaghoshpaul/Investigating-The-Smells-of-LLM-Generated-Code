
public class CombinationCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int count = 0;
        
        for (int p = 0; p <= 1000; p++) {
            for (int q = 0; q <= 1000; q++) {
                for (int r = 0; r <= 1000; r++) {
                    int s = n - p - q - r;
                    if (s >= 0 && s <= 1000) {
                        count++;
                    }
                }
            }
        }
        
        System.out.println("Number of combinations that satisfy p + q + r + s = " + n + " is: " + count);
    }
}
