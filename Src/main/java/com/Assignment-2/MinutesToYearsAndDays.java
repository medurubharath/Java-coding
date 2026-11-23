import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();
        if (minutes < 0) {
            System.out.println("Minutes cannot be negative.");
            return;
        }
        long years = minutes / (365L * 24 * 60);
        long days = (minutes % (365L * 24 * 60)) / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
