//Animal.java
class Animal {
  public void eat() {
    System.out.println("Animal eats.");
  }

  public void sound() {
    System.out.println("Animal makes a sound.");
  }
}
//Lion.java
class Lion extends Animal {
  @Override
  public void eat() {
    System.out.println("Lion eats meat.");
  }

  @Override
  public void sound() {
    System.out.println("Lion roars.");
  }
}
//Tiger.java
class Tiger extends Animal {
  @Override
  public void eat() {
    System.out.println("Tiger eats meat and sometimes fish.");
  }

  @Override
  public void sound() {
    System.out.println("Tiger growls.");
  }
}
//Panther.java
class Panther extends Animal {
  @Override
  public void eat() {
    System.out.println("Panther eats meat and small mammals.");
  }

  @Override
  public void sound() {
    System.out.println("Panther purrs and sometimes hisses.");
  }
}
//Main.java
public class Main {
  public static void main(String[] args) {
    Animal lion = new Lion();
    Animal tiger = new Tiger();
    Animal panther = new Panther();

    lion.eat();
    lion.sound();

    tiger.eat();
    tiger.sound();

    panther.eat();
    panther.sound();
  }
}
