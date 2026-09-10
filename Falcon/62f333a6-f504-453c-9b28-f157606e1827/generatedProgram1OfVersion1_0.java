import java.util.Random;

public class Craps {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int sum = dice1 + dice2;
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else if (sum == 7) {
            System.out.println("You win");
        } else if (sum == 11) {
            System.out.println("point is " + sum);
        } else if (sum == 8) {
            System.out.println("You win");
        } else if (sum == 5) {
            System.out.println("point is " + sum);
        } else if (sum == 6) {
            System.out.println("You lose");
        }
    }
}

// 