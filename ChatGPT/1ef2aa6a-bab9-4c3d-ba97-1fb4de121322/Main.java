class Student {
    String name;
    String id;
    int[] marks;

    public Student(String name, String id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public void validateMarks() {
        int validCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 0 && marks[i] <= 100) {
                marks[validCount] = marks[i];
                validCount++;
            }
        }
        while (validCount < marks.length) {
            marks[validCount] = 0;
            validCount++;
        }
    }

    public void displayMarks() {
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks = {10, -15, 25, 102, 30};
        Student student = new Student("John Doe", "12345", marks);
        
        System.out.print("Before validating: ");
        student.displayMarks();
        
        student.validateMarks();
        
        System.out.print("After validating: ");
        student.displayMarks();
    }
}
