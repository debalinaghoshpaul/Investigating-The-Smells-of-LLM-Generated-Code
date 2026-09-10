package chapter_five;

/**
 * 8. Programming Project 4.12 asked you to create a PizzaOrder class that stores an
 * order consisting of up to three pizzas. Extend this class with the following methods
 * and constructor:
 *  • public int getNumPizzas()—returns the number of pizzas in the order.
 *  • public Pizza getPizza1()—returns the first pizza in the order or null if
 * pizza1 is not set.
 *  •	 public Pizza getPizza2()—returns the second pizza in the order or null
 * if pizza2 is not set.
 *  • public Pizza getPizza3()—returns the third pizza in the order or null if
 * pizza3 is not set.
 * • A copy constructor that takes another PizzaOrder object and makes an
 * independent copy of its pizzas. This might be useful if using an old order as a
 * starting point for a new order.
 *  Write a main method to test the new methods. Changing the pizzas in the new
 * order should not change the pizzas in the original order. For example,
 *  Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
 *  Pizza pizza2 = // Code to create a medium pizza, 2 cheese,
 *  // 2 pepperoni
 *  PizzaOrder order1 = // Code to create an order
 *  order1.setNumPizzas(2); // 2 pizzas in the order
 *  order1.setPizza1(pizza1); // Set first pizza
 *  order1.setPizza2(pizza2); // Set second pizza
 *  double total = order1.calcTotal(); // Should be 18+20 = 38
 *  PizzaOrder order2 = new PizzaOrder(order1); // Use copy
 *  // constructor
 *  order2.getPizza1().setNumCheeseToppings(3); // Change toppings
 *  double total = order2.calcTotal(); // Should be 22 + 20 = 42
 *  double origTotal = order1.calcTotal(); // Should still be 38
 *  Note that the first three lines of code are incomplete. You must complete them as
 * part of the Programming Project.
 *
 * @author Sharaf Qeshta*/

public class Exercise_05_08
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Large", 1, 0, 1); // Code to create a
        // large pizza, 1 cheese, 1 ham

        Pizza pizza2 = new Pizza("Medium", 2, 2, 0); // Code to create
        // a medium pizza, 2 cheese, 2 pepperoni

        PizzaOrder order1 = new PizzaOrder(); // Code to create an order
        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); // Set second pizza

        double total = order1.calcTotal(); // Should be 18+20 = 38
        System.out.println(total); // 38.0

        PizzaOrder order2 = new PizzaOrder(order1); // Use copy constructor
        order2.getPizza1().setCheeseToppings(3); // Change toppings

        total = order2.calcTotal(); // Should be 22 + 20 = 42
        double origTotal = order1.calcTotal(); // Should still be 38

        System.out.println(total); // 42
        System.out.println(origTotal); // 38.0



    }
}
package chapter_five;

public class Pizza
{
    private int size; // 0:small, 1:medium, 2:large (to simplify comparison)
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        setSize(size);
        setCheeseToppings(cheeseToppings);
        setHamToppings(hamToppings);
        setPepperoniToppings(pepperoniToppings);
    }

    // copy constructor
    public Pizza(Pizza pizza)
    {
        if (pizza != null)
        {
            setSize(getSizeString(pizza.getSize()));
            setCheeseToppings(pizza.getCheeseToppings());
            setHamToppings(pizza.getHamToppings());
            setPepperoniToppings(pizza.getPepperoniToppings());
        }
    }

    public int getSizeNumber(String size)
    {
        if (size.equals("Small"))
            return  0;
        else if (size.equals("Medium"))
            return  1;
        else if (size.equals("Large"))
            return  2;
        else
            return -1;
    }

    public String getSizeString(int size)
    {
        if (size == 0)
            return "Small";
        if (size == 1)
            return "Medium";
        if (size == 2)
            return "Large";
        else
            return "Error"; // to make the compiler happy
    }

    public void setSize(String size)
    {
        this.size = getSizeNumber(size);
    }

    public void setCheeseToppings(int cheeseToppings)
    {
        if (cheeseToppings >= 0)
            this.cheeseToppings = cheeseToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings)
    {
        if (pepperoniToppings >= 0)
            this.pepperoniToppings = pepperoniToppings;
    }

    public void setHamToppings(int hamToppings)
    {
        if (hamToppings >= 0)
            this.hamToppings = hamToppings;
    }

    public double calcCost()
    {
        int toppings = cheeseToppings + pepperoniToppings + hamToppings;

        if (size == 0)
            return 10 + toppings * 2;
        if (size == 1)
            return 12 + toppings * 2;
        if (size == 2)
            return 14 + toppings * 2;
        else
            return -1; // to make the compiler happy

    }

    public String getDescription()
    {
        return "Pizza Size: " + getSizeString(size) + ", Cheese Toppings: " + cheeseToppings
                + ", Pepperoni Toppings: " + pepperoniToppings + ", Ham Toppings: " + hamToppings
                + ", Cost: $" + calcCost();
    }

    public int getSize() {
        return size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }
}
package chapter_five;


public class PizzaOrder
{
    private Pizza pizza1, pizza2, pizza3;
    private int numPizzas;

    public PizzaOrder(Pizza pizza1, Pizza pizza2,
                      Pizza pizza3, int numPizzas)
    {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
        setNumPizzas(numPizzas);
    }

    // copy constructor
    public PizzaOrder(PizzaOrder pizzaOrder)
    {
        setNumPizzas(pizzaOrder.getNumPizzas());
        this.pizza1 = new Pizza(pizzaOrder.getPizza1());
        this.pizza2 = new Pizza(pizzaOrder.getPizza2());
        this.pizza3 = new Pizza(pizzaOrder.getPizza3());
    }

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public PizzaOrder()
    {
    }

    public PizzaOrder(int numPizzas)
    {
        setNumPizzas(numPizzas);
    }

    public void setPizza1(Pizza pizza1)
    {
        if (numPizzas >= 1)
            this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2)
    {
        if (numPizzas >= 2)
            this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3)
    {
        if (numPizzas == 3)
            this.pizza3 = pizza3;
    }

    public void setNumPizzas(int numPizzas)
    {
        if (numPizzas > 0 && numPizzas < 4)
            this.numPizzas = numPizzas;
        else
        {
            System.out.println("Error: numPizzas should be between 1-3");
            System.exit(0);
        }
    }

    public double calcTotal()
    {
        double total = 0;
        if (pizza1 != null)
            total += pizza1.calcCost();
        if (pizza2 != null)
            total += pizza2.calcCost();
        if (pizza3 != null)
            total += pizza3.calcCost();
        return total;
    }

    public int getNumPizzas()
    {
        return numPizzas;
    }

    public Pizza getPizza1()
    {
        return pizza1;
    }

    public Pizza getPizza2()
    {
        return pizza2;
    }

    public Pizza getPizza3()
    {
        return pizza3;
    }
}
