import java.util.Scanner;

public class LinearEquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the values of a, b, c, d, e and f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double determinant = a*e - b*d;
        
        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (c*e - b*f) / determinant;
            double y = (a*f - c*d) / determinant;
            
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        
        input.close();
    }

}
