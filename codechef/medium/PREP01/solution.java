import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            long value = 1;

            for (int k = 0; k < N; k++) {
                System.out.print(value + " ");

                value = value * (N - 1 - k) / (k + 1);
            }

            System.out.println();
        }

        sc.close();

	}
}
