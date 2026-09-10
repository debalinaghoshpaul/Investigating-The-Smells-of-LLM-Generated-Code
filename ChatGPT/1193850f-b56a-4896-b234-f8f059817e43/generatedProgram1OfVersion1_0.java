// Animal.java
public class Animal {
    public void move() {
        System.out.println("Animal is moving");
    }
}

// Cheetah.java
public class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah is running");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move(); // Output: Animal is moving

        Cheetah cheetah = new Cheetah();
        cheetah.move(); // Output: Cheetah is running
    }
}
