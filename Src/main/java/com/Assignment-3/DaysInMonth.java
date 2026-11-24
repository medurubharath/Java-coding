import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a month number: ");
        int month = scanner.nextInt();
        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        String monthName = "";
        int days = 0;

        if (month == 1) {
            monthName = "January";
            days = 31;
        } else if (month == 2) {
            monthName = "February";
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 3) {
            monthName = "March";
            days = 31;
        } else if (month == 4) {
            monthName = "April";
            days = 30;
        } else if (month == 5) {
            monthName = "May";
            days = 31;
        } else if (month == 6) {
            monthName = "June";
            days = 30;
        } else if (month == 7) {
            monthName = "July";
            days = 31;
        } else if (month == 8) {
            monthName = "August";
            days = 31;
        } else if (month == 9) {
            monthName = "September";
            days = 30;
        } else if (month == 10) {
            monthName = "October";
            days = 31;
        } else if (month == 11) {
            monthName = "November";
            days = 30;
        } else if (month == 12) {
            monthName = "December";
            days = 31;
        }

        if (days == 0) {
            System.out.println("Invalid month number");
        } else {
            System.out.println(monthName + " " + year + " has " + days + " days");
        }
    }
}
