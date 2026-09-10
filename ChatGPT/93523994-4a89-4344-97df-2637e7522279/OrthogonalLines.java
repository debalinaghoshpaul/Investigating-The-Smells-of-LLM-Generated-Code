
public class OrthogonalLines {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of point P (xp, yp): ");
        double xp = scanner.nextDouble();
        double yp = scanner.nextDouble();
        
        System.out.println("Enter the coordinates of point Q (xq, yq): ");
        double xq = scanner.nextDouble();
        double yq = scanner.nextDouble();
        
        System.out.println("Enter the coordinates of point R (xr, yr): ");
        double xr = scanner.nextDouble();
        double yr = scanner.nextDouble();
        
        System.out.println("Enter the coordinates of point S (xs, ys): ");
        double xs = scanner.nextDouble();
        double ys = scanner.nextDouble();
        
        // calculate the slope of AB and CD
        double slopeAB = (yq - yp) / (xq - xp);
        double slopeCD = (ys - yr) / (xs - xr);
        
        // lines are orthogonal if the product of their slopes is -1
        if (slopeAB * slopeCD == -1) {
            System.out.println("AB and CD are orthogonal.");
        } else {
            System.out.println("AB and CD are not orthogonal.");
        }
        
        scanner.close();
    }
}
