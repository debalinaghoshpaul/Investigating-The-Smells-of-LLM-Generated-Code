import java.util.Date;

public class FindSecondsSince1970 {
    public static void main(String[] args) {
        Date date = new Date();
        long secondsSince1970 = (date.getTime() - new Date().getTime()) / 1000;
        System.out.println("Seconds since 1970: " + secondsSince1970);
    }
}

