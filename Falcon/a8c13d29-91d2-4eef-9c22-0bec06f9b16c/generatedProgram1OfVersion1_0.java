import java.util.Scanner;

public class LastVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String vowel = "aeiou";
            if (str.contains(vowel)) {
                System.out.print(vowel + " ");
            }
        }
    }
}

