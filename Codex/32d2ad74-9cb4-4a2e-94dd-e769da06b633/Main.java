public class Vehicle {
    private String manufacturer;
    private int numCylinders;
    private Person owner;

    public Vehicle(String manufacturer, int numCylinders, Person owner) {
        this.manufacturer = manufacturer;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }

    // Accessor and mutator methods for manufacturer, numCylinders, and owner

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Cylinders: " + numCylinders + ", Owner: " + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehicle other = (Vehicle) obj;
        return manufacturer.equals(other.manufacturer) && numCylinders == other.numCylinders && owner.equals(other.owner);
    }
}

public class Truck extends Vehicle {
    private double loadCapacity;
    private int towingCapacity;

    public Truck(String manufacturer, int numCylinders, Person owner, double loadCapacity, int towingCapacity) {
        super(manufacturer, numCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    // Accessor and mutator methods for loadCapacity and towingCapacity

    @Override
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + " tons, Towing Capacity: " + towingCapacity + " pounds";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Truck other = (Truck) obj;
        return loadCapacity == other.loadCapacity && towingCapacity == other.towingCapacity;
    }
}

public class Person {
    private String name;

    public Person() {
        // Default constructor
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        this.name = other.name;
    }

    // Accessor and mutator methods for name

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return name.equals(other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Vehicle vehicle = new Vehicle("Toyota", 4, person);
        Truck truck = new Truck("Ford", 8, person, 2.5, 10000);

        System.out.println(vehicle);
        System.out.println(truck);
        System.out.println(vehicle.equals(truck));
    }
}
