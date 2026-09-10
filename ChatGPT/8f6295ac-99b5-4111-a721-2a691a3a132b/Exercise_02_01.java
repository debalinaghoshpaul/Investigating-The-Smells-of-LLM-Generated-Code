public class Exercise_02_01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = scanner.nextInt();

        double guess = n/2.0;

        for (int i = 0; i < 5; i++)
        {
            double r = n/guess;
            guess = (guess+r) / 2;
        }

        DecimalFormat format = new DecimalFormat(".00");
        System.out.println("the square root of " + n + " is " + format.format(guess));

    }
}
