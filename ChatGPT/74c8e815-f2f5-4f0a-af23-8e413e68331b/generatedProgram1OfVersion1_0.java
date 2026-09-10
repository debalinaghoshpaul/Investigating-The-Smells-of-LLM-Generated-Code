// Abstract class Animal
abstract class Animal {
    // Abstract method sound
    public abstract void sound();
}

// Subclass Lion extending Animal
class Lion extends Animal {
    // Implementing sound method for Lion
    public void sound() {
        System.out.println("Lion Roars");
    }
}

// Subclass Tiger extending Animal
class Tiger extends Animal {
    // Implementing sound method for Tiger
    public void sound() {
        System.out.println("Tiger Growls");
    }
}

// Main class to test the Animal subclasses
public class Main {
    public static void main(String[] args) {
        // Creating objects of Lion and Tiger classes
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        // Calling the sound method for Lion and Tiger
        lion.sound();
        tiger.sound();
    }
}
