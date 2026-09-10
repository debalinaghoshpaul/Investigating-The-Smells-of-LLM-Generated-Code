
public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] monthSalary = new int[12];
        int[] overtimeHours = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Enter the monthly salary for month " + (i + 1) + ":");
            monthSalary[i] = input.nextInt();

            System.out.println("Enter the overtime hours for month " + (i + 1) + ":");
            overtimeHours[i] = input.nextInt();
        }

        System.out.println("\nMonthly Salary Details:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Month\t\tSalary\t\tOvertime Pay\tTotal Salary\tDifference from Average");
        System.out.println("--------------------------------------------------------------------");

        int totalSalary = 0;

        for (int i = 0; i < 12; i++) {
            int overtimePay;
            if (monthSalary[i] > 10000) {
                overtimePay = overtimeHours[i] * 25;
            } else if (monthSalary[i] > 5000) {
                overtimePay = overtimeHours[i] * 20;
            } else if (monthSalary[i] > 2000) {
                overtimePay = overtimeHours[i] * 15;
            } else {
                overtimePay = overtimeHours[i] * 10;
            }

            int total = monthSalary[i] + overtimePay;
            totalSalary += total;
            int average = totalSalary / (i + 1);

            System.out.println(getMonthName(i) + "\t\t$" + monthSalary[i] + "\t\t$" + overtimePay + "\t\t$" + total + "\t\t$" + (total - average));
        }

        System.out.println("--------------------------------------------------------------------");
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return monthNames[month];
    }
}
