public class PizzaOrder {
    private Pizza[] pizzas;

    public PizzaOrder() {
        this.pizzas = new Pizza[0];
    }

    public void setNumPizzas(int numPizzas) {
        this.pizzas = new Pizza[numPizzas];
    }

    public void setPizza(int index, Pizza newPizza) {
        if (index >= 0 && index < this.pizzas.length) {
            this.pizzas[index] = newPizza;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void displayOrder() {
        System.out.println("Order:");
        for (int i = 0; i < this.pizzas.length; i++) {
            if (this.pizzas[i] != null) {
                System.out.println("Pizza " + (i + 1) + ": " + this.pizzas[i].getDescription());
            } else {
                System.out.println("Pizza " + (i + 1) + ": (No pizza)");
            }
        }
    }

    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        
        Pizza pizza1 = new Pizza("Margherita", 10.99);
        Pizza pizza2 = new Pizza("Pepperoni", 12.99);

        order.setPizza(0, pizza1);
        order.setPizza(1, pizza2);

        order.displayOrder();
    }
}

class Pizza {
    private String description;
    private double price;

    public Pizza(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description + " $" + price;
    }
}
