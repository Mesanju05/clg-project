import java.util.*;

class Solution {

    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
            .mapToInt(row -> Arrays.stream(row).sum())-
            .max()
            .getAsInt();
    }

    public static void main(String[] args) {

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            
        };

        Solution obj = new Solution();

        int result = obj.maximumWealth(accounts);

        System.out.println(result);
    }
}