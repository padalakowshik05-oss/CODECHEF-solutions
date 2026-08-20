import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int[] a=new int[l];
		for(int i=0;i<l;i++){
		    a[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int d=sc.nextInt();
		int cnt=0;
		for(int i=0;i<l;i++){
		    if(Math.abs(a[i]-n)<=d){
		        cnt++;
		    }
		}
		if(cnt>0){
		    System.out.println(cnt);
		}else{
		    System.out.println(-1);
		}

	}
}
