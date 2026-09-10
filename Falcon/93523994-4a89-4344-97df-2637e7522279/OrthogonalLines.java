import java.util.Scanner;

public class OrthogonalLines {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the coordinates of the points
        System.out.println("Enter the coordinates of point P (xp, yp): ");
        int xp = input.nextInt();
        int yp = input.nextInt();

        System.out.println("Enter the coordinates of point Q (xq, yq): ");
        int xq = input.nextInt();
        int yq = input.nextInt();

        System.out.println("Enter the coordinates of point R (xr, yr): ");
        int xr = input.nextInt();
        int yr = input.nextInt();

        System.out.println("Enter the coordinates of point S (xs, ys): ");
        int xs = input.nextInt();
        int ys = input.nextInt();

        // Calculate the slopes of the lines AB and CD
        double slopeAB = (double) (yq - yp) / (xq - xp);
        double slopeCD = (double) (ys - yr) / (xs - xr);

        // Check if the lines are orthogonal
        if (slopeAB * slopeCD == -1) {
            System.out.println("The lines AB and CD are orthogonal.");
        } else {
            System.out.println("The lines AB and CD are not orthogonal.");
        }
    }
}
