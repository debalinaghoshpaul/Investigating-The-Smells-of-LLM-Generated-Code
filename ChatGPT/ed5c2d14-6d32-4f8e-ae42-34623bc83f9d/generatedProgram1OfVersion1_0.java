
public class Powers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int square = number * number;
        int cube = number * number * number;
        int fourthPower = number * number * number * number;

        System.out.println("Square of the number: " + square);
        System.out.println("Cube of the number: " + cube);
        System.out.println("Fourth power of the number: " + fourthPower);
    }
}