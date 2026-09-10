public class Animal {
    public void move() {
        System.out.println("Animal is moving");
    }
}

public class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cheetah cheetah = new Cheetah();
        animal.move();
        cheetah.move();
    }
}

