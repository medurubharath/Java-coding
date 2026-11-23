
import java.util.Scanner;

class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        float distance = sc.nextFloat();

        System.out.print("Input hour: ");
        int hours = sc.nextInt();

        System.out.print("Input minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Input seconds: ");
        int seconds = sc.nextInt();

        float totalSeconds = hours * 3600 + minutes * 60 + seconds;

        float metersPerSecond = distance / totalSeconds;
        float kilometersPerHour = (distance / 1000) / (totalSeconds / 3600);
        
        float milesPerHour = kilometersPerHour / 1.609f;
        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kilometersPerHour);
        System.out.println("Your speed in miles/h is " + milesPerHour);

        sc.close();
    }
}
