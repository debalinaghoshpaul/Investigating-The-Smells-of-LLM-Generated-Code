package chapter_four;

import java.util.Date;

/**
 * 4. Define a class called Journal that could be used to store an entry for a research
 * paper that will be published. The class should have instance variables to store the
 * author’s name, title of the paper, and the date of submission using the Date class
 * from this chapter. Add a constructor to the class that allows the user of the class
 * to set all instance variables. Also add a method, displayDetails, that outputs all
 * the instance variables, and another method called getSubmissionDetails that
 * returns the title of the paper, with the first letter of each word capitalized. Test your
 * class from the main method
 * 
 * @author Sharaf Qeshta
 * */

public class Exercise_04_04
{
    public static void main(String[] args)
    {
        Journal journal = new Journal("Sharaf Qeshta", "java programming", new Date());
        journal.displayDetails(); // Sharaf Qeshta, java programming, Sat Mar 12 09:25:46 PST 2022
        System.out.println(journal.getSubmissionDetails()); // Java Programming
    }
}

// Second part
package chapter_four;

import java.util.Date;

public class Journal
{
    private String author, title;
    private Date date;

    public Journal(String author, String title, Date date)
    {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public void displayDetails()
    {
        System.out.println(author + ", " + title + ", " + date.toString());
    }

    public String getSubmissionDetails()
    {
        String capitalized = "";
        capitalized +=  Character.toUpperCase(title.charAt(0));
        for (int i = 0; i < title.length()-1; i++){
            if (title.charAt(i) == ' ')
                capitalized += Character.toUpperCase(title.charAt(i+1));
            else
                capitalized += title.charAt(i+1);
        }
        return capitalized;
    }
}
