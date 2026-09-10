package chapter_six;

/**
 * 9. Enhance the definition of the class PartiallyFilledArray (Display 6.5) in the
 * following way: When the user attempts to add one additional element and there
 * is no room in the array instance variable a, the user is allowed to add the element.
 * The object creates a second array that is twice the size of the array a, copies values
 * from the array a to the user’s new array, makes this array (or more precisely its
 * reference) the new value of a, and then adds the element to this new larger array a.
 * Hence, this new class should have no limit (other than the physical size of the computer)
 * to how many numbers it can hold. The instance variable maxNumberOfElements
 * remains and the method getMaxCapacity is unchanged, but these now refer to the
 * currently allocated memory and not to an absolute upper bound. Write a suitable
 * test program.
 *
 * @author Sharaf Qeshta
 * */



public class Exercise_06_09
{
    public static void main(String[] args)
    {
        PartiallyFilledArray array = new PartiallyFilledArray(); // initial size 10
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);
        array.add(1.0);

        array.add(43.0); // eleventh element

        System.out.println(array.getMaxCapacity()); // 20
        System.out.println(array.getNumberOfElements()); // 11
        System.out.println(array.getElement(10)); // 43.0

        array.deleteLast();

        System.out.println(array.getNumberOfElements()); // 10
    }
}

package chapter_six;

/**
 Class for a partially filled array of doubles. The class enforces the
 following invariant: All elements are at the beginning of the array in
 locations 0, 1, 2, and so forth up to a highest index with no gaps.
 */

public class PartiallyFilledArray
{
    private int maxNumberElements; //Same as a.length
    private double[] a;
    private int numberUsed; //Number of indices currently in use

    /**
      Sets the maximum number of allowable elements to 10.
      */
    PartiallyFilledArray()
    {
        maxNumberElements = 10;
        a = new double[maxNumberElements];
        numberUsed = 0;
    }

    /**
     21 Precondition arraySize > 0.
     22 */
    PartiallyFilledArray(int arraySize)
    {
        if (arraySize <= 0)
        {
            System.out.println("Error Array size zero or negative.");
            System.exit(0);
        }
        maxNumberElements = arraySize;
        a = new double[maxNumberElements];
        numberUsed = 0;
    }


    PartiallyFilledArray(PartiallyFilledArray original)
    {
        if (original == null)
        {
            System.out.println("Fatal Error: aborting program.");
            System.exit(0);
        }
        maxNumberElements =
             original.maxNumberElements;
        numberUsed = original.numberUsed;
        a = new double[maxNumberElements];
        for (int i = 0; i < numberUsed; i++)
            a[i] = original.a[i];
   }


    /**
      Adds newElement to the first unused array position.
     */
    public void add(double newElement)
    {
        if (numberUsed >= a.length)
        {
            double[] temp = new double[a.length*2];
            for (int i = 0; i < a.length; i++)
                temp[i] = a[i];

            temp[numberUsed++] = newElement;
            a = temp;
            maxNumberElements = a.length;

        }
        else
        {
            a[numberUsed] = newElement;
            numberUsed++;
        }
    }


    public double getElement(int index)
    {
        if (index < 0 || index >= numberUsed)
        {
            System.out.println("Error:Illegal or unused index.");
            System.exit(0);
        }
        return a[index];
    }


    /**
      index must be an index in use or the first unused index.
      */
    public void resetElement(int index, double newValue)
    {
        if (index < 0 || index >= maxNumberElements)
        {
            System.out.println("Error:Illegal index.");
            System.exit(0);
        }
        else if (index > numberUsed)
        {
            System.out.println(
                    "Error: Changing an index that is too large.");
            System.exit(0);
        }
        else
            a[index] = newValue;
     }


    public void deleteLast()
    {
        if (empty())
        {
            System.out.println("Error:Deleting from an empty array.");
            System.exit(0);
        }
        else
            numberUsed--;
    }

    /**
      Deletes the element in position index. Moves down all elements with
      indices higher than the deleted element.
     */
    public void delete(int index)
    {
        if (index < 0 || index >= numberUsed)
        {
            System.out.println("Error:Illegal or unused index.");
            System.exit(0);
        }
        for (int i = index; i < numberUsed; i++)
            a[i] = a[i + 1];
        numberUsed--;
    }

    public boolean empty()
    {
        return (numberUsed == 0);
    }

    public boolean full()
    {
        return (numberUsed == maxNumberElements);
    }

    public int getMaxCapacity()
    {
        return maxNumberElements;
    }


    public int getNumberOfElements()
    {
        return numberUsed;
    }
}
