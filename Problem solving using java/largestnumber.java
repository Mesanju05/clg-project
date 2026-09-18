
import java.util.*;

public class largestnumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

      
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

      
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> {
            String first = a + b;
            String second = b + a;

            return second.compareTo(first);
        });

     
        if (arr[0].equals("0")) {
            System.out.println("0");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        System.out.println(result);

        sc.close();
    }
}

