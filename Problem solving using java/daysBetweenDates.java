import java.util.*;

public class daysBetweenDates {

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    public static int daysFromStart(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int totalDays = 0;

        
        for (int y = 1971; y < year; y++) {
            if (isLeapYear(y)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m - 1];

            
            if (m == 2 && isLeapYear(year)) {
                totalDays++;
            }
        }

        
        totalDays += day;

        return totalDays;
    }

    public static int daysBetweenDates(String date1, String date2) {
        int days1 = daysFromStart(date1);
        int days2 = daysFromStart(date2);

        return Math.abs(days1 - days2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date1 = sc.next();
        String date2 = sc.next();

        System.out.println(daysBetweenDates(date1, date2));

        sc.close();
    }
}