public class PizzaOrder {
    private int numPizzas;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public void setNumPizzas(int numPizzas) {
        if (numPizzas >= 1 && numPizzas <= 3) {
            this.numPizzas = numPizzas;
        } else {
            System.out.println("Number of pizzas must be between 1 and 3.");
        }
    }

    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2) {
        if (numPizzas >= 2) {
            this.pizza2 = pizza2;
        } else {
            System.out.println("There are not enough pizzas in the order to set the second pizza.");
        }
    }

    public void setPizza3(Pizza pizza3) {
        if (numPizzas == 3) {
            this.pizza3 = pizza3;
        } else {
            System.out.println("There are not enough pizzas in the order to set the third pizza.");
        }
    }

    public double calcTotal() {
        double total = 0.0;

        if (pizza1 != null) {
            total += pizza1.calcCost();
        }
        if (pizza2 != null) {
            total += pizza2.calcCost();
        }
        if (pizza3 != null) {
            total += pizza3.calcCost();
        }

        return total;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 1, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 0);

        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);

        double total = order.calcTotal();
        System.out.println("Total cost of the order: $" + total);
    }
}
