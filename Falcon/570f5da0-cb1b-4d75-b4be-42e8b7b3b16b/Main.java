import java.util.Scanner;

class Solution {
    /**
     * Calculate the Hamming weight of a given string.
     *
     * @param s The input string.
     * @return The Hamming weight of the string.
     */
    public int hammingWeight(String s) {
        int weight = 0;
        for (char c : s.toCharArray()) {
            weight += c - '0';
        }
        return weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int weight = solution.hammingWeight(s);
        System.out.println(weight);
    }
}
