
public class DayOfTheDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the date (yyyy/mm/dd): ");
        String date = input.next();
        
        String[] dateArr = date.split("/");
        
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        
        int totalDays = 0;
        
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i-1];
        }
        
        totalDays += day;
        
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            totalDays++;
        }
        
        int dayOfWeekIndex = totalDays % 7;
        
        System.out.println("The day of the date is: " + daysOfWeek[dayOfWeekIndex]);
        
        input.close();
    }
}
