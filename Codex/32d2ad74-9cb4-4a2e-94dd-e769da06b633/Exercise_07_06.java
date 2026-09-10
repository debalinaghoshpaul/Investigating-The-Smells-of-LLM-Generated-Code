package chapter_seven;

/**
 * 6. Create a class called Vehicle that has the manufacturer’s name (type String),
 * number of cylinders in the engine (type int), and owner (type Person given
 * next). Then, create a class called Truck that is derived from Vehicle and has the
 * following additional properties: the load capacity in tons (type double since it may
 * contain a fractional part) and towing capacity in pounds (type int). Be sure your
 * class has a reasonable complement of constructors, accessor and mutator methods,
 * and suitably defined equals and toString methods. Write a program to test all
 * your methods.
 *  The definition of the class Person follows. Completing the definitions of the
 * methods is part of this programming project.
 * public class Person
 * {
 *  private String name;
 *  public Person()
 *  {...}
 *  public Person(String theName)
 *  {...}
 *  public Person(Person theObject)
 *  {...}
 *  public String getName()
 *  {...}
 *  public void setName(String theName)
 *  {...}
 *  public String toString()
 *  {...}
 *  public boolean equals(Object other)
 *  {...}
 * }
 *
 * @author Sharaf Qeshta */


public class Exercise_07_06
{
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Vehicle("Mercedes", 800,
                new Person("Sharaf Qeshta"));
        Vehicle vehicle2 = new Vehicle("Nissan", 750,
                new Person("John Smith"));

        Truck truck1 = new Truck("Vovlo", 430,
                new Person(), 12.5, 500);
        Truck truck2 = new Truck("Vovlo", 430,
                new Person(), 12.5, 500);

        System.out.println(vehicle1); // Vehicle Manufacturer: Mercedes, Vehicle Cylinders: 800, Vehicle Owner: Person Name Sharaf Qeshta
        System.out.println(vehicle2); // Vehicle Manufacturer: Nissan, Vehicle Cylinders: 750, Vehicle Owner: Person Name John Smith

        System.out.println(truck1); // Vehicle Manufacturer: Vovlo, Vehicle Cylinders: 430, Vehicle Owner: Person Name No Name Yet, Load Capacity: 12.5, Towing Capacity: 500
        System.out.println(truck2); // Vehicle Manufacturer: Vovlo, Vehicle Cylinders: 430, Vehicle Owner: Person Name No Name Yet, Load Capacity: 12.5, Towing Capacity: 500

        System.out.println(truck1.equals(truck2)); // true
        System.out.println(vehicle1.equals(truck1)); // false
        System.out.println(vehicle1.equals(vehicle2)); // false
    }
}
package chapter_seven;

public class Person
{
    String name;

    public Person()
    {
        name = "No Name Yet";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public Person(Person person)
    {
        this.name = person.getName();
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String toString()
    {
        return "Person Name " + name;
    }


    public boolean equals(Person other)
    {
        return name.equals(other.getName());
    }
}
package chapter_seven;

public class Truck extends Vehicle
{
    private double loadCapacity;
    private int towingCapacity;


    public Truck(String manufacturerName,
                 int numberOfCylinders,
                 Person owner)
    {
        super(manufacturerName, numberOfCylinders, owner);
    }

    public Truck(String manufacturerName, int numberOfCylinders,
                 Person owner, double loadCapacity,
                 int towingCapacity)
    {
        super(manufacturerName, numberOfCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }


    public double getLoadCapacity()
    {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity)
    {
        this.loadCapacity = loadCapacity;
    }

    public int getTowingCapacity()
    {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity)
    {
        this.towingCapacity = towingCapacity;
    }

    public String toString()
    {
        return super.toString() + ", Load Capacity: " + loadCapacity
                + ", Towing Capacity: " + towingCapacity;
    }


    public boolean equals(Truck other)
    {
        return super.equals(other)
                && loadCapacity == other.getLoadCapacity()
                && towingCapacity == other.getTowingCapacity();
    }
}
package chapter_seven;

public class Vehicle
{
    private String manufacturerName;
    private int numberOfCylinders;
    private Person owner;


    public Vehicle(String manufacturerName,
                   int numberOfCylinders,
                   Person owner)
    {
        this.manufacturerName = manufacturerName;
        this.numberOfCylinders = numberOfCylinders;
        this.owner = owner;
    }


    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }

    public int getNumberOfCylinders()
    {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders)
    {
        this.numberOfCylinders = numberOfCylinders;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }


    public String toString()
    {
        return "Vehicle Manufacturer: " + getManufacturerName()
                + ", Vehicle Cylinders: " + getNumberOfCylinders()
                + ", Vehicle Owner: " + owner.toString();
    }


    public boolean equals(Vehicle other)
    {
        return manufacturerName.equals(other.getManufacturerName())
                && numberOfCylinders == other.getNumberOfCylinders()
                && owner.equals(other.owner);
    }
}
