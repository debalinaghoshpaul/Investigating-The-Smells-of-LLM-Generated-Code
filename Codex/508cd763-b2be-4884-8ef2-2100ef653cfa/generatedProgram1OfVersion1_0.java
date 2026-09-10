public class School {
    private List<String> students;
    private List<String> teachers;
    private List<String> classes;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(String teacher) {
        teachers.remove(teacher);
    }

    public void createClass(String className) {
        classes.add(className);
    }
}