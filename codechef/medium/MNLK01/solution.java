import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		int k=sc.nextInt();
		for(int i=0;i<n;i++){
		    int l=Math.abs(a[i]-t);
		    if(l<=k){
		        c++;
		    }
		}
		if(c==0){
		    System.out.println(-1);
		}
		else{
		    System.out.println(c);
		}
		

	}
}
