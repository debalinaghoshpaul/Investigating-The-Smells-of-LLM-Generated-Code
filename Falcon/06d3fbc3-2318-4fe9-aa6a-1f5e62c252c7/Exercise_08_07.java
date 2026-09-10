package chapter_eight;

public class DiscountSale extends Sale
{
    private double discount; //A percent of the price. Cannot be negative.
    public DiscountSale()
    {
        super();
        discount = 0;
    }

    /**
        Precondition: theName is a nonempty string; thePrice is
        nonnegative; theDiscount is expressed as a percent of the price
        and is nonnegative.
    */
    public DiscountSale(String theName,
            double thePrice, double theDiscount)
    {
        super (theName, thePrice);
        setDiscount(theDiscount);
    }

    public DiscountSale(DiscountSale originalObject)
    {
        super (originalObject);
        discount = originalObject.discount;
    }

    public static void announcement()
    {
        System.out.println("This is the DiscountSale class.");
    }

    public double bill()
    {
        double fraction = discount/100;
        return (1 - fraction)*getPrice();
    }

    public double getDiscount()
    {
        return discount;
    }

    /**
        Precondition: Discount is nonnegative.
    */
    public void setDiscount(double newDiscount)
    {
        if (newDiscount >= 0)
            discount = newDiscount;
        else
        {
            System.out.println("Error: Negative discount.");
            System.exit(0);
        }
    }

    public String toString()
    {
        return (getName() + " Price = $" + getPrice()
            + " Discount = " + discount + "%\n"
        + " Total cost = $" + bill());
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else
        {
            DiscountSale otherDiscountSale =
                    (DiscountSale)otherObject;
            return (super.equals(otherDiscountSale)
                    && discount == otherDiscountSale.discount);
        }
    }
}

package chapter_eight;


/**
 * 7. Define a class named MultiItemSale that represents a sale of multiple items of
 * type Sale given in Display 8.1 (or of the types of any of its descendent classes).
 * The class MultiItemSale will have an instance variable whose type is Sale[],
 * which will be used as a partially filled array. There will also be another instance
 * variable of type int that keeps track of how much of this array is currently used.
 * The exact details on methods and other instance variables, if any, are up to you.
 * Use this class in a program that obtains information for items of type Sale and of
 * type DiscountSale (Display 8.2) and that computes the total bill for the list of
 * items sold
 *
 * @author Sharaf Qeshta */

public class Exercise_08_07
{
    public static void main(String[] args)
    {
        MultiItemSale items = new MultiItemSale();

        for (int i = 0; i < 25; i++)
            items.add(new Sale("Item" + i, 3 * (i+1)));
        for (int i = 25; i < 50; i++)
            items.add(new DiscountSale("Item" + i, 2 * (i), i));

        items.printAllItems();
        System.out.println("Total Price: $" + items.getBill()); // Total Price: $2064.52
    }
}

package chapter_eight;

public class MultiItemSale
{
    private Sale[] items = new Sale[50];
    private int index = 0;

    public MultiItemSale() {}

    public void add(Sale sale, int index)
    {
        if (index > -1 && index < 50)
            items[index] = sale;
    }

    public void add(Sale sale)
    {
        if (index+1 > 49)
            return;
        items[index++] = sale;
    }

    public double getBill()
    {
        double total = 0;
        for (int i = 0; i < items.length; i++)
        {
            if (items[i] == null)
                continue;
            total += items[i].bill();
        }
        return total;
    }


    public void printAllItems()
    {
        for (int i = 0; i < items.length; i++)
        {
            if (items[i] == null)
                continue;
            System.out.println(items[i]);
        }
    }
}

package chapter_eight;

/**
 Class for a simple sale of one item with no tax, discount, or other
 adjustments.
 Class invariant: The price is always nonnegative; the name is a nonempty
 string.
 */

public class Sale
{
    private String name; //A nonempty string
    private double price; //nonnegative
    public Sale()
    {
        name = "No name yet";
        price = 0;
    }

    /**
    Precondition: theName is a nonempty string; thePrice is nonnegative.
    */
    public Sale(String theName, double thePrice)
    {
        setName(theName);
        setPrice(thePrice);
    }

    public Sale(Sale originalObject)
    {
        if (originalObject == null)
        {
            System.out.println("Error: null Sale object.");
            System.exit(0);
        }
        //else
        name = originalObject.name;
        price = originalObject.price;
    }

    public static void announcement()
    {
        System.out.println("This is the Sale class.");
    }

    public double getPrice()
    {
        return price;
    }

    /**
     Precondition: newPrice is nonnegative.
     */
    public void setPrice(double newPrice)
    {
        if (newPrice >= 0)
            price = newPrice;
        else
        {
            System.out.println("Error: Negative price.");
            System.exit(0);
        }
    }

    public String getName()
    {
        return name;
    }

    /**
    Precondition: newName is a nonempty string.
    */
    public void setName(String newName)
    {
        if (newName != null && newName != "")
            name = newName;
        else
        {
            System.out.println("Error: Improper name value.");
            System.exit(0);
        }
    }

    public String toString()
    {
        return (name + " Price and total cost = $" + price);
    }

    public double bill()
    {
        return price;
    }

    /*
    Returns true if the names are the same and the bill for the calling
    object is equal to the bill for otherSale; otherwise returns false.
    Also returns false if otherObject is null.
    */

    public boolean equalDeals(Sale otherSale)
    {
        if (otherSale == null)
            return false;
        else
            return (name.equals(otherSale.name)
                && bill() == otherSale.bill());
    }
    /*
        Returns true if the bill for the calling object is less
        than the bill for otherSale; otherwise returns false.
    */
    public boolean lessThan (Sale otherSale)
    {
        if (otherSale == null)
        {
            System.out.println("Error: null Sale object.");
            System.exit(0);
        }
        //else
        return (bill() < otherSale.bill());
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else
        {
            Sale otherSale = (Sale)otherObject;
            return (name.equals(otherSale.name)
            && (price == otherSale.price));
        }
    }
}



