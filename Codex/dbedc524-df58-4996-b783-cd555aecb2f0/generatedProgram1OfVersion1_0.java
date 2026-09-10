// Pet.java
public class Pet {
    public int acepromazine() {
        return 0;
    }

    public int carprofen() {
        return 0;
    }
}

// Dog.java
public class Dog extends Pet {
    @Override
    public int acepromazine() {
        // Calculate dosage for dog
        // ...
        return dosage;
    }

    @Override
    public int carprofen() {
        // Calculate dosage for dog
        // ...
        return dosage;
    }
}

// Cat.java
public class Cat extends Pet {
    @Override
    public int acepromazine() {
        // Calculate dosage for cat
        // ...
        return dosage;
    }

    @Override
    public int carprofen() {
        // Calculate dosage for cat
        // ...
        return dosage;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Dog();
        Pet pet2 = new Cat();

        int dogAcepromazineDosage = pet1.acepromazine();
        int dogCarprofenDosage = pet1.carprofen();

        int catAcepromazineDosage = pet2.acepromazine();
        int catCarprofenDosage = pet2.carprofen();

        // Perform tests with the dosages
        // ...
    }
}