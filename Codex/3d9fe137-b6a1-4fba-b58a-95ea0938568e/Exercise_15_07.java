package chapter_fifteen;

import java.util.Iterator;

/**
 * 7. Add a remove method and an iterator for the Set class in Display 15.37. Write a
 * suitable test program.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_07
{
    public static void main(String[] args)
    {
        Set<Integer> set = new Set<>();

        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);

        /* 13 12 11 10 */
        Iterator<Integer> iterator = set.setIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        /* 13 12 11 10 */
        set.output();

        set.remove(10);
        /* 11 12 13 */
        set.output();
        set.remove(11);
        /* 13 12 */
        set.output();
        set.remove(12);
        /* 13 */
        set.output();
        set.remove(13);

    }
}

package chapter_fifteen;

import java.util.ArrayList;
import java.util.Iterator;

public class Set<T>
{
    private class Node<T>
    {
        private T data;
        private Node<T> link;
        public Node( )
        {
            data = null;
            link = null;
        }

        public Node(T newData, Node<T> linkValue)
        {
            data = newData;
            link = linkValue;
        }
    }//End of Node<T> inner class

    private Node<T> head;

    public Set( )
    {
        head = null;
    }

    /**
        Add a new item to the set. If the item
        is already in the set, false is returned;
        otherwise, true is returned.
    */
    public boolean add(T newItem)
    {
        if (!contains(newItem))
        {
            head = new Node<T>(newItem, head);
            return true;
        }
        return false;
    }

    public boolean remove(T item)
    {
        if (contains(item))
        {
            Set<T> temp = new Set<>();
            temp.add(item);
            head = difference(temp).head;
            return true;
        }
        return false;
    }

    public boolean contains(T item)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(item))
                return true;
            position = position.link;
        }
        return false; //target was not found
    }

    public void output( )
    {
        Node position = head;
        while (position != null)
        {
            System.out.print(position.data.toString( ) + " ");
            position = position.link;
        }
        System.out.println( );
    }

    /**
        Returns a new set that is the union
        of this set and the input set.
        */
    public Set<T> union(Set<T> otherSet)
    {
        Set<T> unionSet = new Set<T>( );
        // Copy this set to unionSet.
        Node<T> position = head;
        while (position != null)
        {
            unionSet.add(position.data);
            position = position.link;
        }

        // Copy otherSet items to unionSet.
        // The add method eliminates any duplicates.
        position = otherSet.head;
        while (position != null)
        {
            unionSet.add(position.data);
            position = position.link;
        }
        return unionSet;
    }
    /**
        Returns a new set that is the intersection
        of this set and the input set.
    */

    public Set<T> intersection(Set<T> otherSet)
    {
        Set<T> interSet = new Set<T>( );
        // Copy only items in both sets.
        Node<T> position = head;
        while (position != null)
        {
            if (otherSet.contains(position.data))
                interSet.add(position.data);
            position = position.link;
        }
        return interSet;
    }

    public Set<T> difference(Set<T> otherSet)
    {
        Set<T> interSet = new Set<T>( );
        // Copy only items in the first set.
        Node<T> position = head;
        while (position != null)
        {
            if (!otherSet.contains(position.data))
                interSet.add(position.data);
            position = position.link;
        }
        return interSet;
    }


    public Iterator<T> setIterator()
    {
        ArrayList<Node<T>> list = new ArrayList<>();
        Node<T> position = head;
        while (position != null)
        {
            list.add(position);
            position = position.link;
        }

        return new Iterator<T>()
        {
            int index = 0;
            @Override
            public boolean hasNext()
            {
                return index < list.size();
            }

            @Override
            public T next()
            {
                return list.get(index++).data;
            }
        };
    }
}



