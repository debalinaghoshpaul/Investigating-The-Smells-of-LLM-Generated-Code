public class Pet {
    private String name;
    private double weight;
    private String type;

    public Pet(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double acepromazine() {
        double mgPerKg;
        double mgPerMl;
        
        if (type.equals("dog")) {
            mgPerKg = 0.03;
            mgPerMl = 10;
        } else {
            mgPerKg = 0.002;
            mgPerMl = 10;
        }
        
        return (weight / 2.2) * (mgPerKg / mgPerMl);
    }

    public double carprofen() {
        double mgPerKg;
        double mgPerMl;
        
        if (type.equals("dog")) {
            mgPerKg = 0.5;
            mgPerMl = 12;
        } else {
            mgPerKg = 0.25;
            mgPerMl = 12;
        }
        
        return (weight / 2.2) * (mgPerKg / mgPerMl);
    }

    public static void main(String[] args) {
        Pet dog = new Pet("Max", 20, "dog");
        System.out.println("Acepromazine dosage for dog " + dog.getName() + ": " + dog.acepromazine() + " ml");
        System.out.println("Carprofen dosage for dog " + dog.getName() + ": " + dog.carprofen() + " ml");

        Pet cat = new Pet("Whiskers", 10, "cat");
        System.out.println("Acepromazine dosage for cat " + cat.getName() + ": " + cat.acepromazine() + " ml");
        System.out.println("Carprofen dosage for cat " + cat.getName() + ": " + cat.carprofen() + " ml");
    }
}
