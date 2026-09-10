public class AnimalSpecies {
    private String speciesName;
    private int population;
    private double growthRate;

    // Constructors
    public AnimalSpecies(String speciesName, int population, double growthRate) {
        this.speciesName = speciesName;
        this.population = population;
        this.growthRate = growthRate;
    }

    // Accessor methods
    public String getSpeciesName() {
        return speciesName;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    // Mutator methods
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    // toString method
    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "speciesName='" + speciesName + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalSpecies that = (AnimalSpecies) o;
        return population == that.population &&
                Double.compare(that.growthRate, growthRate) == 0 &&
                speciesName.equals(that.speciesName);
    }

    // endangered method
    public boolean endangered() {
        return growthRate < 0;
    }

    // Test program
    public static void main(String[] args) {
        AnimalSpecies lion = new AnimalSpecies("Lion", 500, 0.05);
        AnimalSpecies tiger = new AnimalSpecies("Tiger", 300, -0.1);

        System.out.println(lion);
        System.out.println(tiger);

        System.out.println("Is Lion endangered? " + lion.endangered());
        System.out.println("Is Tiger endangered? " + tiger.endangered());

        System.out.println("Are Lion and Tiger the same species? " + lion.equals(tiger));
    }
}
