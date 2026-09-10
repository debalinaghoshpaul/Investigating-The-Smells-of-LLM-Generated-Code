package chapter_four;

/**
 * 9. Define a class whose objects are records on animal species. The class should have
 * instance variables for the species name, population, and growth rate. The growth
 * rate is a percentage that can be positive or negative and can exceed 100%. Include
 * a suitable collection of constructors, mutator methods, and accessor methods.
 * Include a toString method and an equals method. Include a boolean valued
 * method named endangered that returns true when the growth rate is negative
 * and returns false otherwise. Write a test program (or programs) that tests each
 * method in your class definition.
 *
 * @author Sharaf Qeshta*/

public class Exercise_04_09
{
    public static void main(String[] args)
    {
        Specie specie1 = new Specie();
        specie1.setSpecieName("Panda");
        specie1.setPopulation(800);
        specie1.setGrowthRate(-0.9);

        Specie specie2 = new Specie("Elephant", 10000000, 0.8);

        System.out.println(specie1.equals(specie2)); // false
        System.out.println(specie1.endangered()); // true
        System.out.println(specie2.endangered()); // false

        System.out.println(specie1.getSpecieName()); // Panda
        System.out.println(specie1.getPopulation()); // 800
        System.out.println(specie1.getGrowthRate()); // -0.9

        System.out.println(specie1); // Name: Panda, Population: 800, Growth Rate: -0.9%
        System.out.println(specie2); // Name: Elephant, Population: 10000000, Growth Rate: 0.8%
    }
}

//Second part

package chapter_four;

public class Specie
{
    private String specieName;
    private int population;
    private double growthRate;


    public Specie()
    {
    }

    public Specie(String specieName, int population, double growthRate)
    {
        setSpecieName(specieName);
        setPopulation(population);
        setGrowthRate(growthRate);
    }


    public boolean endangered()
    {
        return growthRate < 0;
    }


    public String toString()
    {
        return "Name: " + specieName + ", Population: " + population + ", Growth Rate: " + growthRate + "%";
    }

    public boolean equals(Specie otherSpecie)
    {
        return specieName.equals(otherSpecie.specieName)
                && population == otherSpecie.population
                && growthRate - otherSpecie.growthRate < 0.00001;
    }


    public void setSpecieName(String specieName)
    {
        this.specieName = specieName;
    }

    public void setPopulation(int population)
    {
        this.population = Math.max(population, 0);
    }

    public void setGrowthRate(double growthRate)
    {
        this.growthRate = growthRate;
    }


    public String getSpecieName()
    {
        return specieName;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getGrowthRate()
    {
        return growthRate;
    }
}
