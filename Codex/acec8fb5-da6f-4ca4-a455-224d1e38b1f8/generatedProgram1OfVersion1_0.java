import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number (Table to be calculated): ");
        int number = input.nextInt();
        
        System.out.print("Input number of terms: ");
        int terms = input.nextInt();
        
        for (int i = 0; i <= terms; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        
        input.close();
    }
}