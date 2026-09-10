public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.speedUp();
        bicycle.speedUp();
    }

    public void speedUp() {
        System.out.println("Vehicle speed increased");
    }
}

class Car extends Vehicle {
    public void speedUp() {
        System.out.println("Car speed increased");
    }
}

class Bicycle extends Vehicle {
    public void speedUp() {
        System.out.println("Bicycle speed increased");
    }
}

class Car {
    public void speedUp() {
        System.out.println("Car speed increased");
    }
}

class Bicycle {
    public void speedUp() {
        System.out.println("Bicycle speed increased");
    }
}

