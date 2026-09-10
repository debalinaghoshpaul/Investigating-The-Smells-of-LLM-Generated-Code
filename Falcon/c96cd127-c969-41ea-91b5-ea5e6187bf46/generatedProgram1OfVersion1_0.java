import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTerms = scanner.nextInt();
        int cubeOfNumber = 1;
        for (int i = 1; i <= numberOfTerms; i++) {
            cubeOfNumber = cubeOfNumber * i;
        }
        System.out.println("Number is : " + cubeOfNumber);
    }
}

// 