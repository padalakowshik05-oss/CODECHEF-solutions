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

            for (int i = 0; i < n; i++)
            {
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }

            int max = 0;
            int max_freq = 0;

            for (int freq : mp.values())
            {
                if (freq > max)
                {
                    max = freq;
                    max_freq = 1;
                }
                else if (freq == max)
                {
                    max_freq++;
                }
            }

            System.out.println(max_freq == 1 ? "YES" : "NO");
        }

        sc.close();
    }
}