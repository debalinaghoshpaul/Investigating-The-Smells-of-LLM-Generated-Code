import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                sum += Integer.parseInt(sentence.substring(i, i + 1));
            }
        }
        System.out.println(sum);
    }
}

// 