import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        System.out.println("Input an integer: " + num + " String format of the said integer: " + str);
    }
}

