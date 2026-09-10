import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = 2;
        int result = 0;
        while (num > 0) {
            result = Math.pow(base, sc.nextInt());
            if (result > num) {
                break;
            }
            num = sc.nextInt();
            base *= 2;
        }
        System.out.println(result);
    }
}

// 