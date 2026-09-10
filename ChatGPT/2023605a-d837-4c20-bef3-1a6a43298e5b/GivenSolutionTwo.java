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
