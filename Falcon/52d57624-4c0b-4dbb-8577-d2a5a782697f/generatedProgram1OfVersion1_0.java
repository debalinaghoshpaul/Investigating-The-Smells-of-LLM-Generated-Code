import java.util.Date;

public class ConvertStringToDate {
    public static void main(String[] args) {
        String str = "2020-01-01";
        Date date = new Date(str);
        System.out.println("Date: " + date);
    }
}

