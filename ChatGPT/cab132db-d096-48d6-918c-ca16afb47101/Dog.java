public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        System.out.println("Before modification:");
        System.out.println("Dog 1 Name: " + dog1.getName());
        System.out.println("Dog 1 Breed: " + dog1.getBreed());
        System.out.println("Dog 2 Name: " + dog2.getName());
        System.out.println("Dog 2 Breed: " + dog2.getBreed());

        // Modify attributes using setter methods
        dog1.setName("Cody");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Bella");
        dog2.setBreed("Pit Bull");

        System.out.println("\nAfter modification:");
        System.out.println("Dog 1 Name: " + dog1.getName());
        System.out.println("Dog 1 Breed: " + dog1.getBreed());
        System.out.println("Dog 2 Name: " + dog2.getName());
        System.out.println("Dog 2 Breed: " + dog2.getBreed());
    }
}
