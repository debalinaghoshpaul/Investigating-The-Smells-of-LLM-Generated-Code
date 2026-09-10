
class Player {
    private String name;
    private int highScore;

    public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}

public class PlayerManager {
    private static Player[] players = new Player[10];
    private static int numPlayers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new player");
            System.out.println("2. Print all players");
            System.out.println("3. Find player's score");
            System.out.println("4. Remove a player");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlayer();
                    break;
                case 2:
                    printAllPlayers();
                    break;
                case 3:
                    findPlayerScore(scanner);
                    break;
                case 4:
                    removePlayer(scanner);
                    break;
                case 5:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addPlayer() {
        if (numPlayers < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter player's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter player's high score: ");
            int score = scanner.nextInt();

            players[numPlayers] = new Player(name, score);
            numPlayers++;
            System.out.println("Player added successfully");
        } else {
            System.out.println("Maximum number of players reached");
        }
    }

    private static void printAllPlayers() {
        System.out.println("\nPlayers and their high scores:");
        for (int i = 0; i < numPlayers; i++) {
            System.out.println(players[i].getName() + ": " + players[i].getHighScore());
        }
    }

    private static void findPlayerScore(Scanner scanner) {
        System.out.print("Enter player's name to find score: ");
        String name = scanner.next();
        boolean found = false;
        for (int i = 0; i < numPlayers; i++) {
            if (players[i].getName().equals(name)) {
                System.out.println("Score of " + name + " is " + players[i].getHighScore());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Player with name " + name + " not found");
        }
    }

    private static void removePlayer(Scanner scanner) {
        System.out.print("Enter player's name to remove: ");
        String name = scanner.next();
        int index = -1;
        for (int i = 0; i < numPlayers; i++) {
            if (players[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numPlayers - 1; i++) {
                players[i] = players[i + 1];
            }
            numPlayers--;
            System.out.println("Player " + name + " removed successfully");
        } else {
            System.out.println("Player with name " + name + " not found");
        }
    }
}