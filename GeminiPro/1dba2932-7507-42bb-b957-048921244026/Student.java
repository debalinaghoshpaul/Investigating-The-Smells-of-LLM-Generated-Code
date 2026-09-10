import java.util.ArrayList;

public class Student {
    private String student_id;
    private String student_name;
    private ArrayList<Double> grades;

    public Student(String student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<Double>();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grade must be between 0.0 and 100.0.");
        }
    }

    public double calculateAverageGrade() {
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student [student_id=" + student_id + ", student_name=" + student_name + ", grades=" + grades + "]";
    }

    public static void main(String[] args) {
        Student student1 = new Student("123456", "John Doe");
        student1.addGrade(90.0);
        student1.addGrade(85.0);
        student1.addGrade(95.0);
        System.out.println(student1);
        System.out.println("Average grade: " + student1.calculateAverageGrade());
    }
}
