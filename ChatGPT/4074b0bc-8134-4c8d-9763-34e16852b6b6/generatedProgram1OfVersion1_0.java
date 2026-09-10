// Animal.java
// Parent class Animal

abstract class Animal {
    // Abstract methods to be implemented by subclasses
    public abstract void move();
    public abstract void makeSound();
}

// Bird.java
// Subclass Bird

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirps");
    }
}

// Panthera.java
// Subclass Panthera

class Panthera extends Animal {
    @Override
    public void move() {
        System.out.println("Runs");
    }

    @Override
    public void makeSound() {
        System.out.println("Roars");
    }
}

// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        // Create objects of the subclasses
        Animal bird = new Bird();
        Animal panther = new Panthera();

        // Call the methods of the subclasses
        bird.move();
        bird.makeSound();

        panther.move();
        panther.makeSound();
    }
}

