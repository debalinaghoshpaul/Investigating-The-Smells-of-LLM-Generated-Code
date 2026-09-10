// Base class Animal
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        
        animal.sound();
        bird.sound();
        cat.sound();
    }
}