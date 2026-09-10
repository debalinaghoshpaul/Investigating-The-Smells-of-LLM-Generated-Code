
public class ParallelogramType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the diagonal: ");
        double diagonal = input.nextDouble();

        if (side1 == side2 && diagonal * diagonal == side1 * side1 + side2 * side2) {
            System.out.println("The parallelogram is a rectangle.");
        } else if (side1 == side2 && diagonal * diagonal != side1 * side1 + side2 * side2) {
            System.out.println("The parallelogram is a rhombus.");
        } else {
            System.out.println("The parallelogram is neither a rectangle nor a rhombus.");
        }
    }
}
