// Animal.java
// Abstract class Animal
abstract class Animal {
    public abstract void sound();
}
// Lion.java
// Subclass Lion
class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars!");
    }
}
// Tiger.java
// Subclass Tiger
class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls!");
    }
}
// Main.java
// Subclass Main

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound(); // Output: Lion roars!

        Animal tiger = new Tiger();
        tiger.sound(); // Output: Tiger growls!
    }
}
