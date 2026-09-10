import java.util.Scanner;

public class ExtractFirstHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String firstHalf = str.substring(0, str.length()/2);
        System.out.println(firstHalf);
    }
}

// 