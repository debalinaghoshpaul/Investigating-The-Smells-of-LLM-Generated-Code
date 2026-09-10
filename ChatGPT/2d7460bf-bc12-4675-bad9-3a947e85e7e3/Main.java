// Abstract class Bird
abstract class Bird {
    // Abstract method fly
    public abstract void fly();
    
    // Abstract method makeSound
    public abstract void makeSound();
}

// Subclass Eagle
class Eagle extends Bird {
    // Implementing fly method for Eagle
    public void fly() {
        System.out.println("Eagle flies high in the sky");
    }
    
    // Implementing makeSound method for Eagle
    public void makeSound() {
        System.out.println("Eagle makes a screeching sound");
    }
}

// Subclass Hawk
class Hawk extends Bird {
    // Implementing fly method for Hawk
    public void fly() {
        System.out.println("Hawk flies swiftly in the air");
    }
    
    // Implementing makeSound method for Hawk
    public void makeSound() {
        System.out.println("Hawk makes a sharp cry");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();
        
        eagle.fly();
        eagle.makeSound();
        
        hawk.fly();
        hawk.makeSound();
    }
}
