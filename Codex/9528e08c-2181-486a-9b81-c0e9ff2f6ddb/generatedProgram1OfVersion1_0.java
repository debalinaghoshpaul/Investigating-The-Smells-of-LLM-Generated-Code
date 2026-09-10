// Base class Animal
class Animal {
    public void eat() {
        // Default eat method
        System.out.println("Animal eats food");
    }

    public void sound() {
        // Default sound method
        System.out.println("Animal makes a sound");
    }
}

// Subclass Lion
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

// Subclass Tiger
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}

// Subclass Panther
class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("Panther eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Panther purrs");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sound();

        Lion lion = new Lion();
        lion.eat();
        lion.sound();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sound();

        Panther panther = new Panther();
        panther.eat();
        panther.sound();
    }
}