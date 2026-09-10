// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        // Create instances of SnakeAlien and BugAlien
        Alien snakeAlien = new SnakeAlien("Slither", 10);
        Alien bugAlien = new BugAlien("Buzz", 5);

        // Print the details of each alien
        System.out.println(snakeAlien.toString());
        System.out.println(bugAlien.toString());
    }
}
