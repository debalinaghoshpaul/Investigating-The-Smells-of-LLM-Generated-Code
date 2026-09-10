public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        if (size.equalsIgnoreCase("Small")) {
            return 10 + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        } else if (size.equalsIgnoreCase("Medium")) {
            return 12 + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        } else if (size.equalsIgnoreCase("Large")) {
            return 14 + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        } else {
            return 0;
        }
    }

    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheeseToppings + ", Pepperoni Toppings: " + pepperoniToppings +
                ", Ham Toppings: " + hamToppings + ", Cost: $" + calcCost();
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", 1, 1, 2);
        Pizza pizza2 = new Pizza("Medium", 2, 0, 1);

        System.out.println("Pizza 1: " + pizza1.getDescription());
        System.out.println("Pizza 2: " + pizza2.getDescription());
    }
}
