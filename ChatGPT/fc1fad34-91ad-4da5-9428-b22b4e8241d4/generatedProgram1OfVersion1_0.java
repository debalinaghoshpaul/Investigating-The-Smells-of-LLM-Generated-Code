import java.util.*;
class AngleBetweenHands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        double angle = Math.abs(((h % 12) * 60 + m) - 60 * m) / 2;
        System.out.println(angle + " degrees");
    }
}
