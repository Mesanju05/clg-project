
import java.util.Scanner;

public class dayoftheyear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

     
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }

        int result = day;

        for (int i = 0; i < month - 1; i++) {
            result = result + days[i];
        }

        System.out.println(result);

        sc.close();
    }
}

