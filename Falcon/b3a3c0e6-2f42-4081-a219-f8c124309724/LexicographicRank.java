import java.util.*;
import java.math.*;
import java.io.*;

public class LexicographicRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }
        int rank = 1;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(j) < str.charAt(i)) {
                    cnt++;
                }
            }
            rank += cnt * fact[n - i - 1];
        }
        System.out.println(rank);
    }
}
