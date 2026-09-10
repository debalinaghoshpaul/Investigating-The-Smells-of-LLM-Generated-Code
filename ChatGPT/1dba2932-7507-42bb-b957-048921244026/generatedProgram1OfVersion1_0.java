public class Student {

    private int student_id;
    private String student_name;
    private List<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
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

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade. Grade should be between 0 and 100.");
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "John Doe");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());

        student.addGrade(95);
        student.addGrade(105); // Trying to add an invalid grade

        System.out.println("Student Grades: " + student.getGrades());
    }
}
