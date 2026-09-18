
import java.util.Scanner;

public class dayoftheweek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        
        String[] week = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };

      
        int[] days = {
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

        
        if (isLeapYear(year)) {
            days[1] = 29;
        }

        
        for (int m = 0; m < month - 1; m++) {
            totalDays += days[m];
        }

      
        totalDays += day - 1;

        
        int dayIndex = (5 + totalDays) % 7;

        System.out.println(week[dayIndex]);

        sc.close();
    }

   
    public static boolean isLeapYear(int year) {

        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }
}
