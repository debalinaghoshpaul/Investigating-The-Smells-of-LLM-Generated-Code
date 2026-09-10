package chapter_seven;

/**
 * 8. Programming Project 4.10 required adding an instance variable to the Pet class
 * defined in Display 4.15 to indicate if the pet is a dog or cat. A better organization
 * is to define Pet as a superclass of the Dog and Cat classes. This organization
 * eliminates the need for an instance variable to indicate the type of the pet. Do
 * or redo Programming Project 4.10 with inheritance. The acepromazine() and
 * carprofen() methods should be defined in the Pet class to simply return 0. Override
 * both methods in the Dog and Cat classes to calculate the correct dosage. Write
 * a main method with appropriate tests to exercise the changes.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_07_08
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setAge(1);
        dog.setName("Poppy");
        dog.setWeight(20);

        Cat cat = new Cat();
        cat.setAge(1);
        cat.setName("Catty");
        cat.setWeight(20);

        /*
         * CAT: Name: Catty Age: 1 years
         * Weight: 20.0 pounds
         * */
        System.out.println(cat);

        /*
         * DOG: Name: Poppy Age: 1 years
         * Weight: 20.0 pounds
         * */
        System.out.println(dog);

        System.out.println(dog.acepromazine()); // 0.02727272727272727
        System.out.println(dog.carprofen()); // 0.37878787878787873

        System.out.println(cat.acepromazine()); // 0.0018181818181818182
        System.out.println(cat.carprofen()); // 0.18939393939393936
    }
}
package chapter_seven;

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
}
package chapter_seven;

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
}
package chapter_seven;


public class Pet
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


    public double acepromazine()
    {
        return 0;
    }

    public double carprofen()
    {
        return 0;
    }


    public boolean equals(Pet pet)
    {
        return getAge() == pet.getAge()
                && getName().equals(pet.getName())
                && getWeight() == pet.getWeight();
    }
}
