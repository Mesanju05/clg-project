import java.util.*;

public class hashset
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        for(int i = 0;i < n;i++)
        {
            String a = sc.next();
            String b = sc.next();

            String pair = a + " " + b;

            set.add(pair);

            System.out.println(set.size());
        }
        sc.close();

    }
}
