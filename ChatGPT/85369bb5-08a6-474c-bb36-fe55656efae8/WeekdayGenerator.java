import java.util.Scanner;

public class WeekdayGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 7: ");
        int num = input.nextInt();
        
        String weekday = getWeekday(num);
        
        if(weekday.equals("Invalid input")) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            System.out.println(weekday);
        }
        
        input.close();
    }
    
    public static String getWeekday(int num) {
        switch(num) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid input";
        }
    }

}
