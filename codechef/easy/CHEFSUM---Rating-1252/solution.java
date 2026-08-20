import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		int n = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int ans = 1;

            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();

                if (x < min) {
                    min = x;
                    ans = i;
                }
            }

            System.out.println(ans);
		}	
	    
	}
}
