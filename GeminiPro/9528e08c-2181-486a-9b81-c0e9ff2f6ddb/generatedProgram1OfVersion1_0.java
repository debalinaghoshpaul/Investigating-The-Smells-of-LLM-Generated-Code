// Animal.java
// Parent class Animal

abstract class Animal {
    // Eat method (abstract)
    public abstract void eat();

    // Sound method (abstract)
    public abstract void sound();
}

// Lion.java
// Child class Lion

class Lion extends Animal {
    // Eat method (overridden)
    @Override
    public void eat() {
        System.out.println("The lion eats meat.");
    }

    // Sound method (overridden)
    @Override
    public void sound() {
        System.out.println("The lion roars.");
    }
}

// Tiger.java
// Child class Tiger

class Tiger extends Animal {
    // Eat method (overridden)
    @Override
    public void eat() {
        System.out.println("The tiger eats meat.");
    }

    // Sound method (overridden)
    @Override
    public void sound() {
        System.out.println("The tiger growls.");
    }
}

// Panther.java
// Child class Panther

class Panther extends Animal {
    // Eat method (overridden)
    @Override
    public void eat() {
        System.out.println("The panther eats meat.");
    }

    // Sound method (overridden)
    @Override
    public void sound() {
        System.out.println("The panther purrs.");
    }
}

// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        // Create an array of animals
        Animal[] animals = {new Lion(), new Tiger(), new Panther()};

        // Loop through the animals and make them eat and sound
        for (Animal animal : animals) {
            animal.eat();
            animal.sound();
            System.out.println();
        }
    }
}
