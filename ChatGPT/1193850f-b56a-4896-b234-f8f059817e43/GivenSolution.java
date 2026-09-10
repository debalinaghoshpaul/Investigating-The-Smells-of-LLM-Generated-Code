// Animal.java
// Parent class Animal

public class Animal {
    public void move() {
        System.out.println("Animal moves");
    }
}
// Cheetah.java
// Child class Cheetah
public class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("This cheetah is running!");
    }
}
// Main.java
// Main class
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
