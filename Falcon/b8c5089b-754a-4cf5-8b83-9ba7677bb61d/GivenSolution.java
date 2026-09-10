// Animal.java
// Base class Animal

public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
// Bird.java
// Subclass Bird

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}
// Cat.java
// Subclass Cat

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.makeSound(); // Output: The animal makes a sound
        bird.makeSound();   // Output: The bird chirps
        cat.makeSound();    // Output: The cat meows
    }
}
