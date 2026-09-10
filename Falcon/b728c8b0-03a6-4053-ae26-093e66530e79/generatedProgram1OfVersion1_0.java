import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        float roundedNum = Math.round(num);
        System.out.println("The rounded float value is: " + roundedNum);
    }
}

