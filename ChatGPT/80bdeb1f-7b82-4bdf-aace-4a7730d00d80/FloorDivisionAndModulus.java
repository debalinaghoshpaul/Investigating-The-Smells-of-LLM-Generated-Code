
public class FloorDivisionAndModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Floor division
        int floorDivision = dividend / divisor;
        System.out.println("Floor Division: " + floorDivision);

        // Floor modulus
        int floorModulus = dividend % divisor;
        System.out.println("Floor Modulus: " + floorModulus);
        
        sc.close();
    }
}
