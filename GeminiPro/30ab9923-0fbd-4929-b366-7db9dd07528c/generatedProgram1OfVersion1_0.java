// Abstract class Animal
abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

// Lion class extends Animal
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps in a den.");
    }
}

// Tiger class extends Animal
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a jungle.");
    }
}

// Deer class extends Animal
class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in a meadow.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat(); // Lion eats meat.
        lion.sleep(); // Lion sleeps in a den.

        Animal tiger = new Tiger();
        tiger.eat(); // Tiger eats meat.
        tiger.sleep(); // Tiger sleeps in a jungle.

        Animal deer = new Deer();
        deer.eat(); // Deer eats grass.
        deer.sleep(); // Deer sleeps in a meadow.
    }
}
