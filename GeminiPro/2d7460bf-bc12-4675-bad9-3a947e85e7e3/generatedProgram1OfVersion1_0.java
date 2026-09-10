// Bird.java
// Parent class Bird

abstract class Bird {

    // Abstract methods
    public abstract void fly();
    public abstract void makeSound();
}

// Eagle.java
// Child class Eagle

class Eagle extends Bird {

    // Implemented methods
    @Override
    public void fly() {
        System.out.println("Eagle is flying high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is screeching.");
    }
}

// Hawk.java
// Child class Hawk

class Hawk extends Bird {

    // Implemented methods
    @Override
    public void fly() {
        System.out.println("Hawk is soaring through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk is whistling.");
    }
}

// Main.java
// Main class

public class Main {

    public static void main(String[] args) {

        // Create objects of Eagle and Hawk
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        // Call fly() and makeSound() methods
        eagle.fly();
        eagle.makeSound();

        System.out.println();

        hawk.fly();
        hawk.makeSound();
    }
}
