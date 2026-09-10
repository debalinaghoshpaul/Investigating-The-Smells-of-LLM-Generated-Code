public class Student {
    private int student_id;
    private String student_name;
    private int grades;

    public Student(int student_id, String student_name, int grades) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = grades;
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        if (grade > 100) {
            throw new IllegalArgumentException("Grade cannot be greater than 100.");
        }
        if (grade < 0) {
            throw new IllegalArgumentException("Grade cannot be negative.");
        }
        if (grades + grade > 100) {
            throw new IllegalArgumentException("Grade cannot be greater than 100.");
        }
        if (grades + grade < 0) {
            throw new IllegalArgumentException("Grade cannot be negative.");
        }
        grades += grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", grades=" + grades +
                '}';
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "John", 100);
        student.addGrade(101);
        System.out.println(student);
    }
}

