import java.util.Scanner;

public class PlayerHighScores {
    public static void main(String[] args) {
        String[] players = new String[10];
        int[] scores = new int[10];
        int numPlayers = 0;

        Scanner input = new Scanner(System.in);

        int choice = 0;
        while(choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Add a new player and score");
            System.out.println("2. Print all players' names and scores");
            System.out.println("3. Find player's score by name");
            System.out.println("4. Remove a player");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    if(numPlayers < 10) {
                        System.out.print("Enter player's name: ");
                        String playerName = input.next();
                        System.out.print("Enter player's score: ");
                        int playerScore = input.nextInt();
                        players[numPlayers] = playerName;
                        scores[numPlayers] = playerScore;
                        numPlayers++;
                    } else {
                        System.out.println("Maximum of 10 players reached.");
                    }
                    break;
                case 2:
                    System.out.println("Players and their scores:");
                    for(int i = 0; i < numPlayers; i++) {
                        System.out.println(players[i] + ": " + scores[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter player's name to find score: ");
                    String playerName = input.next();
                    int playerIndex = -1;
                    for(int i = 0; i < numPlayers; i++) {
                        if(players[i].equals(playerName)) {
                            playerIndex = i;
                            break;
                        }
                    }
                    if(playerIndex != -1) {
                        System.out.println(playerName + "'s score is: " + scores[playerIndex]);
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter player's name to remove: ");
                    playerName = input.next();
                    int removeIndex = -1;
                    for(int i = 0; i < numPlayers; i++) {
                        if(players[i].equals(playerName)) {
                            removeIndex = i;
                            break;
                        }
                    }
                    if(removeIndex != -1) {
                        for(int i = removeIndex; i < numPlayers - 1; i++) {
                            players[i] = players[i + 1];
                            scores[i] = scores[i + 1];
                        }
                        numPlayers--;
                        System.out.println(playerName + " has been removed.");
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}
