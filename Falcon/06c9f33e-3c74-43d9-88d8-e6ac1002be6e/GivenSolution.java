package chapter_eight;

public class Cat extends Pet
{
    private static final double ACEPROMAZINE_RATIO = 0.002;
    private static final double CARPROFEN_RATIO = 0.25;

    public double acepromazine()
    {
        return (getWeight() / 2.2) * (ACEPROMAZINE_RATIO / 10);
    }

    public double carprofen()
    {
        return (getWeight() / 2.2) * (CARPROFEN_RATIO / 12);
    }

    public String toString()
    {
        return "CAT: " + super.toString();
    }

    public Cat(String initialName, int initialAge, double initialWeight)
    {
        setName(initialName);
        setAge(initialAge);
        setWeight(initialWeight);
    }

    public Cat(){}
}

package chapter_eight;

public class Dog extends Pet
{
    private static final double ACEPROMAZINE_RATIO = 0.03;
    private static final double CARPROFEN_RATIO = 0.5;

    public double acepromazine()
    {
        return (getWeight() / 2.2) * (ACEPROMAZINE_RATIO / 10);
    }

    public double carprofen()
    {
        return (getWeight() / 2.2) * (CARPROFEN_RATIO / 12);
    }

    public String toString()
    {
        return "DOG: " + super.toString();
    }

    public Dog(String initialName, int initialAge, double initialWeight)
    {
        setName(initialName);
        setAge(initialAge);
        setWeight(initialWeight);
    }

    public Dog(){}
}

package chapter_eight;


/**
 * 8. Programming Project 7.8 required rewriting the solution to Programming Project 4.10
 * with inheritance. Redo or do Programming Project 7.8, but instead define the Pet
 * class as an abstract class. The acepromazine() and carprofen() methods should
 * be defined as abstract methods.
 *  In your main method, define an array of type Pet and add two instances of cats
 * and two instances of dogs to the array. Iterate through the array and output how
 * much carprofen and acepromazine each pet would require.
 *
 * @author Sharaf Qeshta */

public class Exercise_08_08
{

    public static void main(String[] args)
    {
        Pet[] pets = new Pet[4];
        pets[0] = new Cat("Catty", 3, 10);
        pets[1] = new Cat("Jasmine", 2, 6);

        pets[2] = new Dog("Max", 2, 12);
        pets[3] = new Dog("Shiba", 1, 5);

        /*
        * Catty Need carprofen: 0.09469696969696968 mg
        * Catty Need acepromazine: 9.090909090909091E-4 mg
        * Jasmine Need carprofen: 0.05681818181818181 mg
        * Jasmine Need acepromazine: 5.454545454545455E-4 mg
        * Max Need carprofen: 0.22727272727272724 mg
        * Max Need acepromazine: 0.01636363636363636 mg
        * Shiba Need carprofen: 0.09469696969696968 mg
        * Shiba Need acepromazine: 0.006818181818181818 mg
        * */

        for (int i = 0; i < pets.length; i++)
        {
            System.out.println(pets[i].getName()
                    + " Need carprofen: " + pets[i].carprofen() + " mg");
            System.out.println(pets[i].getName()
                    + " Need acepromazine: " + pets[i].acepromazine() + " mg");
        }


    }
}

package chapter_eight;


public abstract class Pet
{
    private String name;
    private int age; //in years
    private double weight; //in pounds

    public String toString()
    {
        return ("Name: " + name + " Age: " + age + " years"
                + "\nWeight: " + weight + " pounds");
    }



    public Pet(String initialName,int initialAge,
               double initialWeight)
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println("Error: Wrong age or weight.");
            System.exit(0);
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
        }
    }


    public void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println("Error: Wrong age or weight.");
            System.exit(0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }


    public Pet(String initialName)
    {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public Pet(int initialAge)
    {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void setAge(int newAge)
    {
        if (newAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = newAge;
    }



    public Pet(double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = newWeight;
    }

    public Pet()
    {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }


    public abstract double acepromazine();

    public abstract double carprofen();


    public boolean equals(Pet pet)
    {
        return getAge() == pet.getAge()
                && getName().equals(pet.getName())
                && getWeight() == pet.getWeight();
    }
}


