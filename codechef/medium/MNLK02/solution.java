import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		int n=s.length();
		int m=t.length();
		int count=0;
		if(n!=m){
		    System.out.println("false");
		}
		int[] a=new int[27];
		for(int i=0;i<n;i++){
		    a[s.charAt(i)-'a']++;
		    a[t.charAt(i)-'a']--;
		}
		for(int i=0;i<n;i++){
		    if(a[i]!=0){
		        System.out.println("false");
		        System.exit(0);
		    }
		}
		System.out.println("true");
		
		

	}
}
