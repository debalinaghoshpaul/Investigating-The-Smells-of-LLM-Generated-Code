package chapter_four;

/**
 * 6. Write a grading program for a class with the following grading policies:
 *  a. There are three quizzes, each graded on the basis of 10 points.
 *  b. There is one midterm exam, graded on the basis of 100 points.
 *  c. There is one final exam, graded on the basis of 100 points.
 *  The final exam counts for 40% of the grade. The midterm counts for 35% of the
 * grade. The three quizzes together count for a total of 25% of the grade. (Do not
 * forget to convert the quiz scores to percentages before they are averaged in.)
 *  Any grade of 90 or more is an A, any grade of 80 or more (but less than 90) is a
 * B, any grade of 70 or more (but less than 80) is a C, any grade of 60 or more (but
 * less than 70) is a D, and any grade below 60 is an F. The program should read in
 * the student’s scores and output the student’s record, which consists of three quiz
 * scores and two exam scores, as well as the student’s overall numeric score for the
 * entire course and final letter grade.
 *  Define and use a class for the student record. The class should have instance variables
 *  for the quizzes, midterm, final, overall numeric score for the course, and
 * final letter grade. The overall numeric score is a number in the range 0 to 100,
 * which represents the weighted average of the student’s work. The class should have
 * methods to compute the overall numeric grade and the final letter grade. These last
 * methods should be void methods that set the appropriate instance variables. Your
 * class should have a reasonable set of accessor and mutator methods, an equals
 * method, and a toString method, whether or not your program uses them. You
 * may add other methods if you wish.
 * 
 * @author Sharaf Qeshta
 * */

public class Exercise_04_06
{
    public static void main(String[] args)
    {
        StudentRecord studentRecord = new StudentRecord();
        StudentRecord studentRecord2 = new StudentRecord(10, 10, 10, 100, 100);

        System.out.println(studentRecord); // StudentRecord{quiz1=8.0, quiz2=9.0, quiz3=10.0, Mid Exam=80.0, Final Exam=85.0, Final Score=84.5, Letter=B}
        System.out.println(studentRecord.equals(studentRecord2)); // true
        System.out.println(studentRecord.getScore()); // 100
        System.out.println(studentRecord.getLetter()); // A


    }
}

// Second part

package chapter_four;

import java.util.Locale;
import java.util.Scanner;

public class StudentRecord
{
    private double q1, q2, q3, midExam, finalExam;
    private double score;
    private char letter;

    public StudentRecord(double q1, double q2, double q3,
                         double midExam, double finalExam)
    {
        setQ1(q1);
        setQ2(q2);
        setQ3(q3);
        setMidExam(midExam);
        setFinalExam(finalExam);
    }


    public StudentRecord()
    {
        readFromKeyboard();
    }



    public void readFromKeyboard()
    {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter quiz 1 grade (0-10): ");
        double quiz1 = scanner.nextDouble();
        setQ1(quiz1);

        System.out.print("Enter quiz 2 grade (0-10): ");
        double quiz2 = scanner.nextDouble();
        setQ2(quiz2);

        System.out.print("Enter quiz 3 grade (0-10): ");
        double quiz3 = scanner.nextDouble();
        setQ3(quiz3);

        System.out.print("Enter the mid term grade (0-100): ");
        double mid = scanner.nextDouble();
        setMidExam(mid);

        System.out.print("Enter the final term grade (0-100): ");
        double finalTerm = scanner.nextDouble();
        setFinalExam(finalTerm);
        scanner.close();
        System.out.println();
    }


    public void computeDegree()
    {
        double quizzes = ((q1 * 10) + (q2 * 10) + (q3 * 10)) / 12;
        double finalExamPercentage = finalExam / 2.5;
        double midExamPercentage = midExam / (20/7.0);
        score = quizzes + finalExamPercentage + midExamPercentage;
    }

    public void assignLetter()
    {
        if (score > 90)
            letter = 'A';
        else if (score > 80)
            letter = 'B';
        else if (score > 70)
            letter = 'C';
        else if (score > 60)
            letter = 'D';
        else
            letter = 'F';
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "quiz1=" + getQ1() +
                ", quiz2=" + getQ2() +
                ", quiz3=" + getQ3() +
                ", Mid Exam=" + getMidExam() +
                ", Final Exam=" + getFinalExam() +
                ", Final Score=" + getScore() +
                ", Letter=" + getLetter() +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof StudentRecord)
            return getScore() - ((StudentRecord) o).getScore() < 0.000001; // double comparison
        return false;
    }


    public double getQ1()
    {
        return q1;
    }

    public double getQ2() {
        return q2;
    }

    public double getQ3() {
        return q3;
    }

    public double getMidExam() {
        return midExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public double getScore() {
        computeDegree();
        return score;
    }

    public char getLetter() {
        assignLetter();
        return letter;
    }


    public void setQ1(double q1) {
        if (q1 > -1 & q1 < 11)
            this.q1 = q1;
    }

    public void setQ2(double q2) {
        if (q2 > -1 & q2 < 11)
            this.q2 = q2;
    }

    public void setQ3(double q3) {
        if (q3 > -1 & q3 < 11)
            this.q3 = q3;
    }

    public void setMidExam(double midExam) {
        if (midExam > -1 & midExam < 101)
            this.midExam = midExam;
    }

    public void setFinalExam(double finalExam) {
        if (finalExam > -1 & finalExam < 101)
            this.finalExam = finalExam;
    }
}
