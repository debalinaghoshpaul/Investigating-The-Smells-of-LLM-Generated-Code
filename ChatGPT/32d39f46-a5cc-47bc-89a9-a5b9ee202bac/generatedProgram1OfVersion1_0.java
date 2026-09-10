
public class GPAConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        int percentage = input.nextInt();

        double gpa = (double) percentage / 100 * 4;

        System.out.println("(" + percentage + "/100) * 4 = " + gpa);
    }
}