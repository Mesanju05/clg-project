import java.util.Arrays;
import java.util.Scanner;

public class squaresort {

    public int[] sortedSquares(int[] arr) {

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        int[] res = new int[arr.length];
        int beg = 0;
        int end = arr.length - 1;

       

        for (int pos = arr.length - 1; pos >= 0; pos--) {
            if (arr[beg] > arr[end]) {
                res[pos] = arr[beg];
                beg++;
            } else {
                res[pos] = arr[end];
                end--;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        squaresort s = new squaresort();

        int[] result = s.sortedSquares(arr);

        System.out.println("Sorted Squares: " + Arrays.toString(result));

        inp.close();
    }
}