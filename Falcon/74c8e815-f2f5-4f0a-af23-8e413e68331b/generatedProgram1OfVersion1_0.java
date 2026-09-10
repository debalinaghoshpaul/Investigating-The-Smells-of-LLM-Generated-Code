abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars.");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger roars.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound(); // prints "Lion roars."

        Animal tiger = new Tiger();
        tiger.sound(); // prints "Tiger roars."
    }
}
