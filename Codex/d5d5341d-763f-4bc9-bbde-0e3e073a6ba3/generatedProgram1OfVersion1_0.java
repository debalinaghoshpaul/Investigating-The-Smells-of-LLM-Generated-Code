public class TowersOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3; // Change this value to the number of disks you want to solve for
        solveTowersOfHanoi(numDisks, 'A', 'C', 'B');
    }

    public static void solveTowersOfHanoi(int numDisks, char source, char destination, char auxiliary) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowersOfHanoi(numDisks - 1, source, auxiliary, destination);
        System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);
        solveTowersOfHanoi(numDisks - 1, auxiliary, destination, source);
    }
}