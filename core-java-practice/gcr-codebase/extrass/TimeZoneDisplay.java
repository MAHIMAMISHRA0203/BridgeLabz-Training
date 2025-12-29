import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    public static void main(String[] args) {
        // Define the target time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata"); // IST is observed in Asia/Kolkata
        ZoneId pstZone = ZoneId.of("America/Los_Angeles"); // PST/PDT is observed in America/Los_Angeles

        // Get the current time in the system's default time zone
        ZonedDateTime now = ZonedDateTime.now();

        // Format for cleaner output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS O VV");

        // Convert the current time to specific time zones and print
        System.out.println("Current Time:");
        System.out.println("GMT (Greenwich Mean Time)  : " + now.withZoneSameInstant(gmtZone).format(formatter));
        System.out.println("IST (Indian Standard Time) : " + now.withZoneSameInstant(istZone).format(formatter));
        System.out.println("PST (Pacific Standard Time): " + now.withZoneSameInstant(pstZone).format(formatter));
    }
}