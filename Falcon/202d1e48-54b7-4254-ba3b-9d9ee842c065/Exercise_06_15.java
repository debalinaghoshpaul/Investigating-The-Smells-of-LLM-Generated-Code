package chapter_six;


/**
 * 15. Programming Project 4.12 asked you to create a PizzaOrder class that stores an
 * order consisting of up to three pizzas. Modify the class to store the pizzas using an
 * array. This will allow the class to include an arbitrary number of pizzas in the order
 * instead of a maximum of three. The setNumPizzas method can be used to create
 * an array of the appropriate size. The array structure allows you to eliminate the
 * methods setPizza1, setPizza2, and setPizza3 and replace them with a single
 * method, setPizza(int index, Pizza newPizza). Include appropriate tests to
 * determine if the new PizzaOrder class is working correctly.
 *
 * @author Sharaf Qeshta */



public class Exercise_06_15
{

    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Small", 5, 4, 0);
        Pizza pizza2 = new Pizza("Large", 4, 2, 0);
        Pizza pizza3 = new Pizza("Small", 0, 1, 3);
        Pizza pizza4 = new Pizza("Medium", 2, 3, 1);
        Pizza pizza5 = new Pizza("Large", 4, 0, 0);
        Pizza pizza6 = new Pizza("Medium", 0, 6, 0);

        PizzaOrder pizzaOrder = new PizzaOrder(6);

        pizzaOrder.setPizza(pizza1, 0);
        pizzaOrder.setPizza(pizza2, 1);
        pizzaOrder.setPizza(pizza3, 2);
        pizzaOrder.setPizza(pizza4, 3);
        pizzaOrder.setPizza(pizza5, 4);
        pizzaOrder.setPizza(pizza6, 5);

        System.out.println(pizzaOrder.calcTotal());

        pizzaOrder.setNumPizzas(7); // 142.0

        Pizza pizza7 = new Pizza("Medium", 2, 3, 2);
        pizzaOrder.setPizza(pizza7, 6);

        System.out.println(pizzaOrder.calcTotal()); // 168.0


    }


}

package chapter_six;

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

package chapter_six;

import java.util.Arrays;

public class PizzaOrder
{
    private Pizza[] pizzas = new Pizza[3]; // default
    private int numPizzas;


    public PizzaOrder(Pizza[] pizzas)
    {
        this.pizzas = pizzas;
        setNumPizzas(pizzas.length);
    }

    public PizzaOrder() {}

    public PizzaOrder(int numPizzas)
    {
        setNumPizzas(numPizzas);
    }

    public void setPizza(Pizza pizza, int index)
    {
        if (index < pizzas.length && index > -1)
            pizzas[index] = pizza;
    }


    public void setNumPizzas(int numPizzas)
    {
        if (numPizzas > 0)
        {
            this.numPizzas = numPizzas;
            Pizza[] temp = new Pizza[this.numPizzas];

            for (int i = 0; i < temp.length && i < pizzas.length; i++)
                temp[i] = pizzas[i];
            pizzas = temp;
        }
    }

    public double calcTotal()
    {
        double total = 0;
        for (int i = 0; i < pizzas.length; i++)
            total += pizzas[i].calcCost();
        return total;
    }
}


