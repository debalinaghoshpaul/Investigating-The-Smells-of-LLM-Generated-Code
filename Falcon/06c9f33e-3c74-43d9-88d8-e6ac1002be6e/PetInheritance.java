import java.util.Arrays;

public class PetInheritance {

    public static void main(String[] args) {
        // Create an array of pets
        Pet[] pets = new Pet[4];

        // Add two instances of cats and two instances of dogs to the array
        pets[0] = new Cat("Fluffy", 10, "Female");
        pets[1] = new Cat("Whiskers", 5, "Male");
        pets[2] = new Dog("Spot", 20, "Male");
        pets[3] = new Dog("Fido", 15, "Female");

        // Iterate through the array and output how much carprofen and acepromazine each pet would require
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " would require " + pet.carprofen() + " mg of carprofen and " + pet.acepromazine() + " mg of acepromazine.");
        }
    }
}

abstract class Pet {

    private String name;
    private int weight;
    private String gender;

    public Pet(String name, int weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public abstract double carprofen();

    public abstract double acepromazine();
}

class Cat extends Pet {

    public Cat(String name, int weight, String gender) {
        super(name, weight, gender);
    }

    @Override
    public double carprofen() {
        return 2.2 * getWeight();
    }

    @Override
    public double acepromazine() {
        return 0.03 * getWeight();
    }
}

class Dog extends Pet {

    public Dog(String name, int weight, String gender) {
        super(name, weight, gender);
    }

    @Override
    public double carprofen() {
        return 4.4 * getWeight();
    }

    @Override
    public double acepromazine() {
        return 0.06 * getWeight();
    }
}
