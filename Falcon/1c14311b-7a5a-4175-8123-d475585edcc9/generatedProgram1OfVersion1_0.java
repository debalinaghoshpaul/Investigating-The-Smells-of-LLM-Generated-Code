import java.util.Scanner;

public class Abecedarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word.length(); i++) {
            if (arr[word.charAt(i) - 'a'] < arr[word.charAt(i)]) {
                System.out.print(word.charAt(i) + " ");
            }
        }
        System.out.println();
    }
}

