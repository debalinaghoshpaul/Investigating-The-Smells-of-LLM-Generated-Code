package chapter_four;

/**
 * 11. Create a class named Pizza that stores information about a single pizza. It should
 * contain the following:
 * • Private instance variables to store the size of the pizza (either small, medium,
 * or large), the number of cheese toppings, the number of pepperoni toppings,
 * and the number of ham toppings.
 * • Constructor(s) that set all of the instance variables.
 * • Public methods to get and set the instance variables.
 * • A public method named calcCost( ) that returns a double that is the cost
 * of the pizza.
 *  Pizza cost is determined by:
 *  Small: $10 + $2 per topping
 *  Medium: $12 + $2 per topping
 *  Large: $14 + $2 per topping
 * • A public method named getDescription( ) that returns a String containing
 * the pizza size, quantity of each topping, and the pizza cost as calculated
 * by calcCost( ).
 *  Write test code to create several pizzas and output their descriptions. For
 * example, a large pizza with one cheese, one pepperoni and two ham toppings
 * should cost a total of $22.
 *
 * @author Sharaf Qeshta*/


public class Exercise_04_11
{
    public static void main(String[] args)
    {
        Pizza pizza1 = new Pizza("Large", 1, 1, 2);
        Pizza pizza2 = new Pizza("Medium", 2, 0, 1);
        Pizza pizza3 = new Pizza("Small", 3, 5, 5);

        System.out.println(pizza1.getDescription()); // Pizza Size: Large, Cheese Toppings: 1, Pepperoni Toppings: 1, Ham Toppings: 2, Cost: $22.0
        System.out.println(pizza2.getDescription()); // Pizza Size: Medium, Cheese Toppings: 2, Pepperoni Toppings: 0, Ham Toppings: 1, Cost: $18.0
        System.out.println(pizza3.getDescription()); // Pizza Size: Small, Cheese Toppings: 3, Pepperoni Toppings: 5, Ham Toppings: 5, Cost: $36.0
    }
}

\\ Second part

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
