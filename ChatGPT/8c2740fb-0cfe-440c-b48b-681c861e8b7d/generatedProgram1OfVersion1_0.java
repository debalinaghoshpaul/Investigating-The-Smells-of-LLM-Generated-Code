// Abstract Person class
abstract class Person {
    // Abstract methods
    public abstract void eat();
    public abstract void exercise();
}

// Subclass of Person representing an Athlete
class Athlete extends Person {
    @Override
    public void eat() {
        System.out.println("Athlete eats a balanced diet with high protein and carbohydrates.");
    }

    @Override
    public void exercise() {
        System.out.println("Athlete exercises regularly with a focus on strength and endurance training.");
    }
}

// Subclass of Person representing a LazyPerson
class LazyPerson extends Person {
    @Override
    public void eat() {
        System.out.println("Lazy person eats junk food and unhealthy snacks.");
    }

    @Override
    public void exercise() {
        System.out.println("Lazy person avoids exercising and prefers lounging around.");
    }
}

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        athlete.eat();
        athlete.exercise();

        LazyPerson lazyPerson = new LazyPerson();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
