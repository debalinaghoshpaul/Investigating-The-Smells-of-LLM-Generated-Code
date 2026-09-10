import java.time.Instant;

public class SecondsSince1970 {

    public static void main(String[] args) {
        // Get the current time as an Instant object
        Instant now = Instant.now();

        // Get the number of seconds since the epoch (January 1, 1970 at 00:00:00 UTC)
        long secondsSince1970 = now.getEpochSecond();

        // Print the number of seconds since the epoch
        System.out.println("Seconds since 1970: " + secondsSince1970);
    }
}
