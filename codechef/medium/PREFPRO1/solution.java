import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] prefix=new int[n];
		prefix[0]=sc.nextInt();
		for(int i=1;i<n;i++){
		    int x=sc.nextInt();
		    prefix[i]=prefix[i-1]+x;
		    
		}
		for(int i=0;i<n;i++){
		    System.out.println(prefix[i]+" ");
		}

	}
}
