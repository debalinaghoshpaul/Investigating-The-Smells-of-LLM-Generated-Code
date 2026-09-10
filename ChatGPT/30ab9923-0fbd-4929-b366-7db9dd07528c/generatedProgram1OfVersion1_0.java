// Abstract class
abstract class Animal {
    // Abstract methods
    public abstract void eat();
    public abstract void sleep();
}

// Subclass Lion
class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps in the den");
    }
}

// Subclass Tiger
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and sometimes fish");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in the grasslands");
    }
}

// Subclass Deer
class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    public void sleep() {
        System.out.println("Deer sleeps in the woods");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat();
        lion.sleep();

        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Animal deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
