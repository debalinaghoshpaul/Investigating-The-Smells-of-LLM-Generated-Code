// BugAlien.java
// Child class BugAlien

public class BugAlien extends Alien {
    // Constructor
    public BugAlien(String name, int damage) {
        super(name, damage);
    }

    // Override toString method
    @Override
    public String toString() {
        return "BugAlien: " + super.toString();
    }
}
