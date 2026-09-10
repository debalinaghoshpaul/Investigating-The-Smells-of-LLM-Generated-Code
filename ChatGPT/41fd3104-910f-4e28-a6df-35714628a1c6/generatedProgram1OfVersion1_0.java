// Animal.java
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Cat.java
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound.

        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow!
    }
}
