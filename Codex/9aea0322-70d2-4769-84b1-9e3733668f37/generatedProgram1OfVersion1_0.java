class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}

class Student extends Person {
    private int studentId;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, int studentId, String course, String teacherName) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Teacher Name: " + teacherName);
    }
}

class Teacher extends Person {
    private String subjectName;
    private double salary;

    public Teacher(String firstName, String lastName, String subjectName, double salary) {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Teacher Details:");
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 12345, "Computer Science", "Jane Smith");
        Student student2 = new Student("Alice", "Johnson", 67890, "Mathematics", "Bob Brown");

        Teacher teacher1 = new Teacher("Jane", "Smith", "Computer Science", 5000);
        Teacher teacher2 = new Teacher("Bob", "Brown", "Mathematics", 4500);

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        teacher1.displayDetails();
        System.out.println();
        teacher2.displayDetails();
    }
}