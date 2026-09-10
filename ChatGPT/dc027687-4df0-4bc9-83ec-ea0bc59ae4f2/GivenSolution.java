public class Exercise_02_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter two numbers: ");
        int x = scanner.nextInt(), y = scanner.nextInt();

        System.out.println("dividend: " + x);
        System.out.println("divisor: " + y);
        System.out.println("quotient: " + (x / y));
        System.out.println("remainder: " + (x % y));

    }
}
