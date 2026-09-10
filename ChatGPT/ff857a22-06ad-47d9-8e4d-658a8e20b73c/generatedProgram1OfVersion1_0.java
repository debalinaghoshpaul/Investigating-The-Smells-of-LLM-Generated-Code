
public class ParallelLines {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of point P (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Enter the coordinates of point Q (x2 y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        System.out.println("Enter the coordinates of point R (x3 y3): ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        System.out.println("Enter the coordinates of point S (x4 y4): ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        if ((y2-y1)/(x2-x1) == (y4-y3)/(x4-x3)) {
            System.out.println("PQ and RS are parallel.");
        } else {
            System.out.println("PQ and RS are not parallel.");
        }
    }
}