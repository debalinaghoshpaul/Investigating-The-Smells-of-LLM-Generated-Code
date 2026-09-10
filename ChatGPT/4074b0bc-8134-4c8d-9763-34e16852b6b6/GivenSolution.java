//Animal.java
class Animal {
  public void move() {
    System.out.println("Animal moves");
  }

  public void makeSound() {
    System.out.println("Animal makes a sound");
  }
}
//Bird.java

class Bird extends Animal {
  @Override
  public void move() {
    System.out.println("Bird flies");
  }

  @Override
  public void makeSound() {
    System.out.println("Bird chirps");
  }
}
//Panthera.java

class Panthera extends Animal {
  @Override
  public void move() {
    System.out.println("Panthera walks");
  }

  @Override
  public void makeSound() {
    System.out.println("Panthera roars");
  }
}
//Main.java
public class Main {
  public static void main(String[] args) {
    Animal bird = new Bird();
    Animal panthera = new Panthera();

    performAction(bird);
    performAction(panthera);
  }

  public static void performAction(Animal animal) {
    animal.move();
    animal.makeSound();
  }
}
