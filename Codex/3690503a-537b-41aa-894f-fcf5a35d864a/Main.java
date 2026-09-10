//Vehicle.java
abstract class Vehicle {
  public abstract void startEngine();

  public abstract void stopEngine();
}
//Car.java
class Car extends Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Car engine started with a key.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Car engine stopped when the key was turned off.");
  }
}
//Motorcycle.java
class Motorcycle extends Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Motorcycle engine started with a kick-start.");
  }

  @Override
  public void stopEngine() {
    System.out.println("Motorcycle engine stopped when ignition was turned off.");
  }
}
//Main.java
public class Main {
  public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle motorcycle = new Motorcycle();

    startAndStopEngine(car);
    startAndStopEngine(motorcycle);
  }

  public static void startAndStopEngine(Vehicle vehicle) {
    vehicle.startEngine();
    vehicle.stopEngine();
  }
}
