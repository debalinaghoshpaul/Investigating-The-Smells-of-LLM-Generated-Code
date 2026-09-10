import java.util.Scanner;

public class RectangleOrRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two adjoining sides of the parallelogram:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the diagonal of the parallelogram:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("The parallelogram is a rectangle.");
        } else if (a == b && b == c && c!= d) {
            System.out.println("The parallelogram is a rhombus.");
        } else if (a!= b && b!= c && c!= d) {
            System.out.println("The parallelogram is not a rectangle or a rhombus.");
        } else {
            System.out.println("The parallelogram is not a rectangle or a rhombus.");
        }
    }
}

// 