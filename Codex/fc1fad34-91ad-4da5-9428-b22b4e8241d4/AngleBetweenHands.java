import java.util.Scanner;

public class AngleBetweenHands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the hour (0-12): ");
        int hour = scanner.nextInt();
        
        System.out.print("Enter the minute (0-59): ");
        int minute = scanner.nextInt();
        
        double hourAngle = (hour % 12 + minute / 60.0) * 30;
        double minuteAngle = minute * 6;
        
        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(angle, 360 - angle);
        
        System.out.println("The angle between the hour and minute hands is: " + angle + " degrees");
        
        scanner.close();
    }
}
