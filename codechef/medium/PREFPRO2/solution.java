import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] prefix = new long[n + 1];

        // Build prefix sum
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            prefix[i] = prefix[i - 1] + x;
        }

        int k = sc.nextInt();

        // Answer queries
        while (k-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            long sum = prefix[b] - prefix[a - 1];

            System.out.println(sum);
        }

	}
}
