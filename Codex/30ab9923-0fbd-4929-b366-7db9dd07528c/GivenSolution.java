// Animal.java
// Abstract class Animal

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}
// Lion.java
// Subclass Lion

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps on grassland.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}
// Deer.java
// Subclass Deer
class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in open fields.");
    }
}
// Main.java
// Subclass Main

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        System.out.println();

        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
