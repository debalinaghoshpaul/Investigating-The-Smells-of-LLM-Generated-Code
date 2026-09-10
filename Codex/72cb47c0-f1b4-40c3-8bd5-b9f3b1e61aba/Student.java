//Student.java
import java.util.ArrayList;

public class Student {
  private String name;
  private int grade;
  private ArrayList < String > courses;

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
    this.courses = new ArrayList < String > ();
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public ArrayList < String > getCourses() {
    return courses;
  }

  public void addCourse(String course) {
    courses.add(course);
  }

  public void removeCourse(String course) {
    courses.remove(course);
  }
  public void printStudentDetails() {
    System.out.println("Name: " + name);
    System.out.println("Grade: " + grade);
  }

}