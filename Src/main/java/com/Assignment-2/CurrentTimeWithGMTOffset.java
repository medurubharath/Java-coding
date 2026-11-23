
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;

class CurrentTimeWithGMTOffset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        int offset = sc.nextInt();

        LocalTime time = LocalTime.now(ZoneOffset.UTC).plusMinutes(offset);

        System.out.println("Current time is " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    
    }
}
