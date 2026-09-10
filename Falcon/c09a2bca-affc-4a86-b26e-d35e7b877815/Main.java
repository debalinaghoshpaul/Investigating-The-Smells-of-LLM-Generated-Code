import java.util.Random;

public class LoadedDice extends Random {

    public LoadedDice() {
        super();
    }

    @Override
    public int nextInt(int num) {
        // With a 50% chance, return the largest number possible (i.e., num - 1).
        // With a 50% chance, return what Random's nextInt method would return.
        if (nextInt(2) == 0) {
            return num - 1;
        } else {
            return super.nextInt(num);
        }
    }
}

public class Main {

    public static void printDiceRolls(Random randGenerator) {
        for (int i = 0; i < 100; i++) {
            System.out.println(randGenerator.nextInt(6) + 1);
        }
    }

    public static void main(String[] args) {
        LoadedDice myDice = new LoadedDice();
        printDiceRolls(myDice);
    }
}
