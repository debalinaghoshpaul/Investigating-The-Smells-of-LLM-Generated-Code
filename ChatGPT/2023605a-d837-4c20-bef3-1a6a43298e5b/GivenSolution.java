package chapter_four;

/**
 * 12. This programming project extends Programming Project 4.11. Create a PizzaOrder
 * class that allows up to three pizzas to be saved in an order. Each pizza saved should be
 * a Pizza object as described in Programming Project 4.11. In addition to appropriate
 * instance variables and constructors, add the following methods:
 * • public void setNumPizzas(int numPizzas)—sets the number of pizzas
 * in the order. numPizzas must be between 1 and 3
 * • public void setPizza1(Pizza pizza1)—sets the first pizza in the order.
 * • public void setPizza2(Pizza pizza2)—sets the second pizza in the order.
 * • public void setPizza3(Pizza pizza3)—sets the third pizza in the order.
 * • public double calcTotal()—returns the total cost of the order.
 *  Write a main method to test the class. The setPizza2 and setPizza3 methods
 * will be used only if there are two or three pizzas in the order, respectively. Sample
 * code illustrating the methods is shown below. Note that first three lines are incomplete.
 * You must complete them as part of the Programming Project.
 * Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
 * Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni
 * PizzaOrder order = // Code to create an order
 * order.setNumPizzas(2); // 2 pizzas in the order
 * order.setPizza1(pizza1); // Set first pizza
 * order.setPizza2(pizza2); // Set second pizza
 * double total = order.calcTotal(); // Should be 18+20 = 38
 *
 * @author Sharaf Qeshta*/


public class Exercise_04_12
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Large", 1, 0, 1); // Code to create a large pizza, 1 cheese, 1 ham
        Pizza pizza2 = new Pizza("Medium", 2, 2, 0); // Code to create a medium pizza, 2 cheese, 2 pepperoni
        PizzaOrder order = new PizzaOrder(); // Code to create an order
        order.setNumPizzas(2); // 2 pizzas in the order
        order.setPizza1(pizza1); // Set first pizza
        order.setPizza2(pizza2); // Set second pizza
        double total = order.calcTotal(); // Should be 18+20 = 38
        System.out.println(total); // 38.0
    }
}

//Second part

package chapter_four;

public class Pizza
{
    private int size; // 0:small, 1:medium, 2:large (to simplify comparison)
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        setSize(size);
        setCheeseToppings(cheeseToppings);
        setHamToppings(hamToppings);
        setPepperoniToppings(pepperoniToppings);
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
}

// Third part

package chapter_four;

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
}
