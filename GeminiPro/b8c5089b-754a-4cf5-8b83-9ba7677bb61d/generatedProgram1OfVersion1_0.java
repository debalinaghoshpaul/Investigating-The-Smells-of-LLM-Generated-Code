// Animal.java
// Parent class Animal

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Bird.java
// Child class Bird

class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird makes a chirp sound");
    }
}

// Cat.java
// Child class Cat

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat makes a meow sound");
    }
}

// Main.java
// Main class

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Animal makes a sound
        
        Bird bird = new Bird();
        bird.sound(); // Bird makes a chirp sound
        
        Cat cat = new Cat();
        cat.sound(); // Cat makes a meow sound
    }
}
