import java.util.Scanner;

public class ParallelogramTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two adjoining sides and the diagonal of the parallelogram
        System.out.println("Enter the length of the first adjoining side: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of the second adjoining side: ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of the diagonal: ");
        double diagonal = scanner.nextDouble();

        // Check if the parallelogram is a rectangle
        if (side1 == side2 && Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) == diagonal) {
            System.out.println("The parallelogram is a rectangle.");
        } 
        // Check if the parallelogram is a rhombus
        else if (side1 == side2) {
            System.out.println("The parallelogram is a rhombus.");
        } 
        // Otherwise, the parallelogram is neither a rectangle nor a rhombus
        else {
            System.out.println("The parallelogram is neither a rectangle nor a rhombus.");
        }
    }
}
