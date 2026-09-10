import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class CalAge {
    private LocalDate dob;
    private LocalDate currentDate;

    public void setDOB(int year, int month, int day) {
        this.dob = LocalDate.of(year, month, day);
    }

    public void setCurrentDate(int year, int month, int day) {
        this.currentDate = LocalDate.of(year, month, day);
    }

    public double calculateAge() {
        Period period = Period.between(this.dob, this.currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        return years + (double) months / 12;
    }

    public boolean isValidDOB(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

public class TestCalAge {
    public static void main(String[] args) {
        CalAge calAge = new CalAge();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth (yyyy mm dd):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (!calAge.isValidDOB(year, month, day)) {
            System.out.println("Invalid date of birth entered.");
            return;
        }

        calAge.setDOB(year, month, day);

        System.out.println("Enter the current date (yyyy mm dd):");
        int currentYear = scanner.nextInt();
        int currentMonth = scanner.nextInt();
        int currentDay = scanner.nextInt();

        calAge.setCurrentDate(currentYear, currentMonth, currentDay);

        System.out.println("Your age is: " + calAge.calculateAge() + " years.");
    }
}
