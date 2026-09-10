// SnakeAlien.java
// Child class SnakeAlien

public class SnakeAlien extends Alien {
    // Constructor
    public SnakeAlien(String name, int damage) {
        super(name, damage);
    }

    // Override toString method
    @Override
    public String toString() {
        return "SnakeAlien: " + super.toString();
    }
}
