package chapter_fifteen;


/**
 * 10. Change the Set<T> class of Display 15.37 so that internally it uses a hash table
 * to store its data instead of a linked list. The headers of the public methods should
 * remain the same so that a program such as the demonstration in Display 15.38
 * should still work without requiring any changes. Add a constructor that allows the
 * user of the new Set<T> class to specify the size of the hash table array.
 * For an additional challenge, implement the set using both a hash table and a
 * linked list. Items added to the set should be stored using both data structures. Any
 * operation requiring lookup of an item should use the hash table, and any operation
 * requiring iteration through the items should use the linked list
 *
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_10
{
    public static void main(String[] args)
    {
        // Round things
        Set<String> round = new Set<>();
        // Green things
        Set<String> green = new Set<>();
        // Add some data to both sets
        round.add("peas");
        round.add("ball");
        round.add("pie");
        round.add("grapes");
        green.add("peas");
        green.add("grapes");
        green.add("garden hose");
        green.add("grass");
        System.out.println("Contents of set round: ");
        round.output( );
        System.out.println("Contents of set green: ");
        green.output( );
        System.out.println( );
        System.out.println("ball in set round? " +
            round.contains("ball"));
        System.out.println("ball in set green? " +
            green.contains("ball"));
        System.out.println("ball and peas in same set? " +
            ((round.contains("ball") &&
            (round.contains("peas"))) ||
            (green.contains("ball") &&
            (green.contains("peas")))));
        System.out.println("pie and grass in same set? " +
            ((round.contains("pie") &&
            (round.contains("grass"))) ||
            (green.contains("pie") &&
            (green.contains("grass")))));
            System.out.print("Union of green and round: ");
            round.union(green).output( );

        System.out.print("Intersection of green and round: ");
        round.intersection(green).output( );


        /*
        * Contents of set round:
        * grapes peas pie ball
        * Contents of set green:
        * garden hose grass grapes peas

        * ball in set round? true
        * ball in set green? false
        * ball and peas in same set? true
        * pie and grass in same set? false
        * Union of green and round: garden hose grass grapes peas pie ball
        * Intersection of green and round: grapes peas
        * */

    }
}

package chapter_fifteen;

import java.util.LinkedList;

public class Set<T>
{
    private static int SIZE = 100;
    private final LinkedList<T>[] hashArray;

    public Set()
    {
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
    }

    public Set(int size)
    {
        SIZE = size;
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
    }

    private int computeHash(T element)
    {
        // since all Classes extends Object hashCode()
        // will return int value
        return Math.abs(element.hashCode()) % SIZE;
    }

    public boolean contains(T element)
    {
        int hash = computeHash(element);
        return hashArray[hash].contains(element);
    }

    public void add(T element)
    {
        int hash = computeHash(element);// Get hash value
        if (!hashArray[hash].contains(element))
        {
            // Only add the target if it's not already
            // on the list.
            hashArray[hash].add(element);
        }
    }

    public LinkedList<T> get(T element)
    {
        int hash = computeHash(element);
        try
        {
            return hashArray[hash];
        }
        catch (Exception exception)
        {
            return null;
        }
    }


    public boolean remove(T element)
    {
        int hash = computeHash(element);
        return hashArray[hash].remove(element);
    }

    public Set<T> union(Set<T> otherSet)
    {
        Set<T> unionSet = new Set<T>( );
        // Copy this set to unionSet.
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
                unionSet.add(element);
        }

        // Copy otherSet set to unionSet.
        for (LinkedList<T> list: otherSet.hashArray)
        {
            for (T element: list)
                unionSet.add(element);
        }
        return unionSet;
    }

    public Set<T> intersection(Set<T> otherSet)
    {
        Set<T> interSet = new Set<T>( );
        // Copy only items in both sets.
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
            {
                if (otherSet.contains(element))
                    interSet.add(element);
            }
        }
        return interSet;
    }

    public Set<T> difference(Set<T> otherSet)
    {
        Set<T> differSet = new Set<T>( );
        // Copy only items in 'this' set.
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
            {
                if (!otherSet.contains(element))
                    differSet.add(element);
            }
        }
        return differSet;
    }

    public void output()
    {
        for (LinkedList<T> list: hashArray)
        {
            for (T element: list)
                System.out.print(element + " ");
        }
        System.out.println();
    }
}


