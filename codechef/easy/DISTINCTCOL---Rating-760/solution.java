import java.util.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();

            HashMap<Integer, Integer> mp = new HashMap<>();

            for (int i = 1; i <= n; i++)
            {
                int balls = sc.nextInt();
                mp.put(i, balls);
            }

            int max = 0;

            for (int value : mp.values())
            {
                if (value > max)
                {
                    max = value;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}