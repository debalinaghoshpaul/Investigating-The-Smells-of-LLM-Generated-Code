import java.util.Arrays;

public class PizzaOrder {

    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[0];
        numPizzas = 0;
    }

    public void setNumPizzas(int numPizzas) {
        if (numPizzas < 0) {
            throw new IllegalArgumentException("Number of pizzas cannot be negative");
        }
        pizzas = new Pizza[numPizzas];
        this.numPizzas = numPizzas;
    }

    public void setPizza(int index, Pizza pizza) {
        if (index < 0 || index >= numPizzas) {
            throw new IndexOutOfBoundsException("Pizza index out of bounds");
        }
        pizzas[index] = pizza;
    }

    public Pizza getPizza(int index) {
        if (index < 0 || index >= numPizzas) {
            throw new IndexOutOfBoundsException("Pizza index out of bounds");
        }
        return pizzas[index];
    }

    public int getNumPizzas() {
        return numPizzas;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Pizza pizza : pizzas) {
            totalCost += pizza.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "pizzas=" + Arrays.toString(pizzas) +
                ", numPizzas=" + numPizzas +
                '}';
    }

    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(3);
        order.setPizza(0, new Pizza("Margherita", 10.0));
        order.setPizza(1, new Pizza("Pepperoni", 12.0));
        order.setPizza(2, new Pizza("Hawaiian", 14.0));
        System.out.println(order);
        System.out.println("Total cost: $" + order.getTotalCost());

        // Test corner cases
        order.setNumPizzas(0);
        System.out.println(order);
        System.out.println("Total cost: $" + order.getTotalCost());

        try {
            order.setPizza(-1, new Pizza("Invalid", 0.0));
            System.out.println("Error: Pizza index out of bounds");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
        }

        try {
            order.setPizza(3, new Pizza("Invalid", 0.0));
            System.out.println("Error: Pizza index out of bounds");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
        }
    }
}
