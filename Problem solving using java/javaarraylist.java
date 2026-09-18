
import java.util.*;

public class javaarraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of lines
        int n = sc.nextInt();

        // Create ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read the numbers
        for (int i = 0; i < n; i++) {

            int d = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        // Number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // Convert to 0-based index
            x--;
            y--;

            // Check if position exists
            if (x >= 0 && x < list.size() &&
                y >= 0 && y < list.get(x).size()) {

                System.out.println(list.get(x).get(y));

            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}

