import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int years = (int) (minutes / (60 * 60 * 24));
        int days = (int) (minutes % (60 * 60 * 24));
        System.out.println("Minutes is approximately " + minutes + " years and " + years + " days.");
        System.out.println("Days is approximately " + days + " days.");
    }
}

// 