class Pizza {
    private String size;
    private String toppings;

    public Pizza(String size, String toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}

class PizzaOrder {
    private Pizza[] pizzas;

    public PizzaOrder(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public int getNumPizzas() {
        return pizzas.length;
    }

    public Pizza getPizza(int index) {
        if (index < 0 || index >= pizzas.length) {
            return null;
        }
        return pizzas[index];
    }

    public PizzaOrder(PizzaOrder other) {
        this.pizzas = new Pizza[other.getNumPizzas()];
        for (int i = 0; i < other.getNumPizzas(); i++) {
            Pizza originalPizza = other.getPizza(i);
            this.pizzas[i] = new Pizza(originalPizza.getSize(), originalPizza.getToppings());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Medium", "Pepperoni");
        Pizza pizza2 = new Pizza("Large", "Mushrooms");

        Pizza[] pizzas = {pizza1, pizza2};

        PizzaOrder order1 = new PizzaOrder(pizzas);

        // Calculate total for order1
        int total1 = calculateTotal(order1);

        // Create a copy of order1
        PizzaOrder order2 = new PizzaOrder(order1);

        // Change toppings for pizza1 in order2
        order2.getPizza(0).setToppings("Sausage");

        // Calculate total for both orders
        int total2 = calculateTotal(order2);

        // Verify that total for order1 remains unchanged
        System.out.println("Total for order1: " + total1);
        System.out.println("Total for order2: " + total2);
    }

    public static int calculateTotal(PizzaOrder order) {
        int total = 0;

        for (int i = 0; i < order.getNumPizzas(); i++) {
            Pizza pizza = order.getPizza(i);

            // Add cost based on size
            if (pizza.getSize().equals("Small")) {
                total += 8;
            } else if (pizza.getSize().equals("Medium")) {
                total += 10;
            } else if (pizza.getSize().equals("Large")) {
                total += 12;
            }

            // Additional cost for extra toppings
            total += pizza.getToppings().split(",").length * 2;
        }

        return total;
    }
}
