public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade, List<String> courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
        }
    }

    public static void main(String[] args) {
        String name = "John";
        int grade = 90;
        List<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("English");
        Student student = new Student(name, grade, courses);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());
        student.addCourse("Science");
        student.removeCourse("Math");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());
    }
}

// 