// Alien.java
// Parent class Alien

// Implementing an abstract class
public abstract class Alien {
    private String name;
    private int damage;

    // Constructor
    public Alien(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    // Abstract method
    public abstract String toString();
}
