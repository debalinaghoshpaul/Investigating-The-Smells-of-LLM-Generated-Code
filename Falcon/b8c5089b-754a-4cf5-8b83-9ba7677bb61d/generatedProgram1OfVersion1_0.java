public class Animal {
    public void Sound() {
        System.out.println("Animal Sound");
    }
}

public class Bird extends Animal {
    public void Sound() {
        System.out.println("Bird Sound");
    }
}

public class Cat extends Animal {
    public void Sound() {
        System.out.println("Cat Sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Bird();
        animal.Sound();
        animal = new Cat();
        animal.Sound();
    }
}

