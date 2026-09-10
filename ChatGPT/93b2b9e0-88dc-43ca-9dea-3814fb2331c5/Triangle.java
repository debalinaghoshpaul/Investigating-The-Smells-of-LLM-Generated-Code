import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side lengths of triangle: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isTriangle = (a + b > c) && (b + c > a) && (c + a > b);

        System.out.println(isTriangle ? "The sides can make a triangle" : "The sides cannot make a triangle");

        scanner.close();
        
    }

}
