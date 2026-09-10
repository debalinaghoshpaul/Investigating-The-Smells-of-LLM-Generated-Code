
public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] names = new String[numStudents];
        String[] ids = new String[numStudents];
        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            names[i] = scanner.next();

            System.out.print("Enter student ID: ");
            ids[i] = scanner.next();

            System.out.print("Enter student score: ");
            scores[i] = scanner.nextInt();
        }

        int maxScore = scores[0];
        int minScore = scores[0];

        for (int i = 1; i < numStudents; i++) {
            maxScore = Math.max(maxScore, scores[i]);
            minScore = Math.min(minScore, scores[i]);
        }

        System.out.println("Highest score: " + maxScore);
        System.out.println("Lowest score: " + minScore);
    }
}
