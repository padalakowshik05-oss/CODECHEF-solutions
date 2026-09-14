import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = sc.nextInt();

                if (i == j || i + j == n - 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println(sum);

	}
}
