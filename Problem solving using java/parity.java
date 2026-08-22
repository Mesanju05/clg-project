import java.util.*;

public class parity {

    public static int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // Find an odd number from the left
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Find an even number from the right
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }

            // Swap them
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortArrayByParity(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}