
public class CombinationFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        int count = 0;
        
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        if (a + b + c + d == n) {
                            count++;
                        }
                    }
                }
            }
        }
        
        System.out.println("Number of combinations: " + count);
    }
}
