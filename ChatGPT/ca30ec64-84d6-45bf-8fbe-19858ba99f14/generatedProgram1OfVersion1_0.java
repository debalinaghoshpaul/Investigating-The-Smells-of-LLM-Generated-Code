import java.time.ZoneOffset;

public class CurrentTimeGMT {
    public static void main(String[] args) {
        int timeZoneOffset = 256;
        
        LocalTime currentTimeGMT = LocalTime.now(ZoneOffset.UTC).plusSeconds(timeZoneOffset);
        
        System.out.println("Current time is " + currentTimeGMT);
    }
}