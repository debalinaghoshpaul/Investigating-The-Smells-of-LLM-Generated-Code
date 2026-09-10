class Pizza {
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private char size;

    public Pizza(char size, boolean pepperoni, boolean sausage, boolean mushrooms) {
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
    }

    public char getSize() {
        return size;
    }

    public int getNumToppings() {
        int numToppings = 0;
        if (pepperoni) {
            numToppings++;
        }
        if (sausage) {
            numToppings++;
        }
        if (mushrooms) {
            numToppings++;
        }
        return numToppings;
    }
}

class PizzaOrder {
    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[10]; // Assuming a maximum of 10 pizzas per order
        numPizzas = 0;
    }

    public void addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms) {
        Pizza pizza = new Pizza(size, pepperoni, sausage, mushrooms);
        pizzas[numPizzas] = pizza;
        numPizzas++;
    }

    public double calcCost() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            char size = pizzas[i].getSize();
            int numToppings = pizzas[i].getNumToppings();
            if (size == 's') {
                totalCost += 8 + numToppings;
            } else if (size == 'm') {
                totalCost += 10 + numToppings;
            } else if (size == 'l') {
                totalCost += 12 + numToppings;
            }
        }
        return totalCost;
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.addPizzaToOrder('s', true, false, true);
        pizzaOrder.addPizzaToOrder('m', false, true, true);
        pizzaOrder.addPizzaToOrder('l', true, true, false);

        double totalCost = pizzaOrder.calcCost();
        System.out.println("Total cost of the order: $" + totalCost);
    }
}
