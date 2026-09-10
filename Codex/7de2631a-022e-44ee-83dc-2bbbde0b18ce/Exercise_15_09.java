package chapter_fifteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 9. Displays 15.34 and 15.35 provide the beginnings of a spell-checker. Refine the
 * program to make it more useful. The modified program should read in a text file, parse
 * each word, see if it is in the hash table, and, if not, output the line number and
 * word of the potentially misspelled word. Discard any punctuation in the original
 * text file. Use the words.txt file as the basis for the hash table dictionary. This file
 * can be found on the book’s website. The file contains 87,314 words in the English
 * language. Test your spell-checker on a short text document.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_15_09
{
    public static void main(String[] args)
    {
        /*
        * classe is Misspelled at line 20
        * Sharaf is Misspelled at line 20
        * Qeshta is Misspelled at line 20
        * classe is Misspelled at line 21
        * Sharaf is Misspelled at line 21
        * Qeshta is Misspelled at line 21
        * classe is Misspelled at line 22
        * Sharaf is Misspelled at line 22
        * Qeshta is Misspelled at line 22
        * * */
        HashTable table = HashTable.getInstance("src/chapter_fifteen/words.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Path: ");
        String filePath = scanner.nextLine();

        try (Scanner reader = new Scanner(new File(filePath)))
        {
            int i = 0;
            while (reader.hasNext())
            {
                i++;
                String[] words = reader.nextLine().trim().split("[\\s\\p{Punct}]+");
                for (String word: words)
                {
                    if (!table.contains(word.toLowerCase()))
                        System.out.println(word + " is Misspelled at line " + i);
                }
            }
        }
        catch (IOException exception)
        {
            System.out.println("File Not Exist !!");
        }
    }
}

package chapter_fifteen;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * the worst case for searching is O(37) and the best case is O(1)
 * this is the faster searching algorithm i encounter so far*/
public class HashTable
{
    private final LinkedList<String>[] hashArray;
    private static final int SIZE = 10000; // for faster searching

    public HashTable( )
    {
        hashArray = new LinkedList[SIZE];
        for (int i=0; i < SIZE; i++)
            hashArray[i] = new LinkedList<>();
    }

    private int computeHash(String word)
    {
        int hash = 0;
        for (int i = 0; i < word.length( ); i++)
        {
            hash += word.charAt(i);
        }
        return hash % SIZE;
    }

    /**
        Returns true if the target is in the hash table,
        false if it is not.
    */
    public boolean contains(String word)
    {
        int hash = computeHash(word);
        LinkedList<String> list = hashArray[hash];
        return list.contains(word);
    }

    /**
    Stores or puts string s into the hash table
    */
    public void put(String word)
    {
        int hash = computeHash(word);// Get hash value
        LinkedList<String> list = hashArray[hash];
        if (!list.contains(word))
        {
            // Only add the target if it's not already
            // on the list.
            hashArray[hash].add(word);
        }
    }

    public LinkedList<String> get(String name)
    {
        int hash = computeHash(name);
        try
        {
            return hashArray[hash];
        }
        catch (Exception exception)
        {
            return null;
        }
    }

    public static HashTable getInstance(String fileName)
    {
        HashTable hashTable = new HashTable();
        try (Scanner scanner = new Scanner(new File(fileName)))
        {
            while (scanner.hasNext())
                hashTable.put(scanner.nextLine().trim());
        }
        catch (IOException exception)
        {
            System.out.println("File Not Exist!!");
        }
        return hashTable;
    }
}



