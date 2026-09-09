import java.util.Arrays;

public class KthSmallestSorting {
    public static int findKthSmallest(int[] arr, int k) {
        
        if (arr == null || k > arr.length || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k or empty array");
        }

        Arrays.sort(arr);

       
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1};
        int k = 3;
        
        System.out.println("The " + k + "rd smallest element is: " + findKthSmallest(arr, k));
    }
}