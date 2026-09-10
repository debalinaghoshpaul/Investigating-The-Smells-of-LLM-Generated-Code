import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime utc = ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.of("UTC"));
        ZonedDateTime gmt = ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.of("GMT"));
        System.out.println(utc.toString());
        System.out.println(gmt.toString());
    }
}

