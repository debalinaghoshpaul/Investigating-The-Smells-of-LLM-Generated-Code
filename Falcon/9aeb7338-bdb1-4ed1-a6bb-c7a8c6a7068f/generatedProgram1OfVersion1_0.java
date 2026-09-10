import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        while (number!= 0) {
            count++;
            number = number & (number - 1);
        }
        System.out.println("Number of bits equal to zero in this representation: " + count);
    }
}

