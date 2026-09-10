package chapter_seven;

/**
 * 1. Define a class named Person that contains two instance variables of type String
 * that stores the first name and last name of a person and appropriate accessor and
 * mutator methods. Also create a method named displayDetails that outputs the
 * details of a person. Next, define a class named Student that is derived from Person,
 * the constructor for which should receive first name and last name from the class
 * Student and also assigns values to student id, course, and teacher name. This class
 * should redefine the displayDetails method to person details as well as details of
 * a student. Include appropriate constructor(s). Define a class named Teacher that
 * is derived from Person. This class should contain instance variables for the subject
 * name and salary. Include appropriate constructor(s). Finally, redefine the
 * displayDetails method to include all teacher information in the printout.
 * Create a main method that creates at least two student objects and two teacher
 * objects with different values and calls displayDetails for each.
 *
 * @author Sharaf Qeshta
 * */

public class Exercise_07_01
{
    public static void main(String[] args)
    {
        Person student1 = new Student("Sharaf", "Qeshta", "12345",
                "Mathematics", "John Smith");
        Person student2 = new Student("Noah", "Smith", "12345",
                "Physics", "Jack Smith");

        Person teacher1 = new Teacher("John", "Smith",
                "Mathematics", 20000);
        Person teacher2 = new Teacher("Jack", "Smith",
                "Physics", 22000);

        student1.displayDetails(); // Student Name: SharafQeshta, Student ID: 12345, Student Course: Mathematics, Student Teacher: John Smith
        student2.displayDetails(); // Student Name: NoahSmith, Student ID: 12345, Student Course: Physics, Student Teacher: Jack Smith

        teacher1.displayDetails(); // Teacher Name: John Smith, Teacher Subject: Mathematics, Teacher Salary: $20000.0
        teacher2.displayDetails(); // Teacher Name: Jack Smith, Teacher Subject: Physics, Teacher Salary: $22000.0
    }
}
package chapter_seven;

public class Person
{
    String firstName, lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayDetails()
    {
        System.out.println("Person Name: " + firstName + " " + lastName);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
package chapter_seven;

public class Student extends Person
{
    String id, course, teacherName;

    public Student(String firstName, String lastName)
    {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName,
                   String id, String course,
                   String teacherName)
    {
        super(firstName, lastName);
        this.id = id;
        this.course = course;
        this.teacherName = teacherName;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Student Name: " + firstName + lastName
                + ", Student ID: " + id + ", Student Course: " + course
                + ", Student Teacher: " + teacherName);
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }
}
package chapter_seven;

public class Teacher extends Person
{
    String subjectName;
    double salary;

    public Teacher(String firstName, String lastName)
    {
        super(firstName, lastName);
    }


    public Teacher(String firstName, String lastName,
                   String subjectName, double salary)
    {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }


    @Override
    public void displayDetails()
    {
        System.out.println("Teacher Name: " + firstName + " " + lastName
                + ", Teacher Subject: " + subjectName
                + ", Teacher Salary: $" + salary);
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
