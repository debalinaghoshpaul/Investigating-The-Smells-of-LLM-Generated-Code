import java.util.Scanner;

public class BabyNamePopularityRanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] maleNames = {"Jacob", "Michael", "Joshua", "Matthew", "Ethan",
                "Alexander", "William", "Daniel", "James", "Joseph"};

        double[] malePopularity = {5.97, 5.93, 5.60, 5.48, 5.45, 5.39, 5.38,
                5.37, 5.35, 5.34};

        String[] femaleNames = {"Emma", "Olivia", "Sophia", "Ava", "Isabella",
                "Mia", "Charlotte", "Amelia", "Harper", "Abigail"};

        double[] femalePopularity = {6.23, 5.97, 5.94, 5.89, 5.87, 5.86, 5.84,
                5.83, 5.80, 5.79};

        boolean anotherInquiry = true;

        while (anotherInquiry) {
            System.out.println("Enter the year: ");
            int year = input.nextInt();

            System.out.println("Enter the gender: ");
            String gender = input.next();

            System.out.println("Enter the name: ");
            String name = input.next();

            int ranking = -1;

            if (gender.equals("M")) {
                for (int i = 0; i < maleNames.length; i++) {
                    if (name.equals(maleNames[i])) {
                        ranking = i + 1;
                        break;
                    }
                }
            } else if (gender.equals("F")) {
                for (int i = 0; i < femaleNames.length; i++) {
                    if (name.equals(femaleNames[i])) {
                        ranking = i + 1;
                        break;
                    }
                }
            }

            if (ranking == -1) {
                System.out.println("The name is not found.");
            } else {
                System.out.println(gender + " name " + name + " is ranked #" + ranking + " in year " + year);
            }

            System.out.println("Enter another inquiry? (Y/N) ");
            String answer = input.next();

            if (answer.equals("N")) {
                anotherInquiry = false;
            }
        }

        input.close();
    }
}
