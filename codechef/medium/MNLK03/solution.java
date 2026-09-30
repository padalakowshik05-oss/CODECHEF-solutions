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
		    int n=sc.nextInt();
		    int count=0;
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        if(a[i]==0){
		            for(int j=i+1;j<n;j++){
		                a[j]=1-a[j];
		            }
		            count++;
		        }
		        else{
		            continue;
		        }
		    }
		    System.out.println(count);
		}

	}
}
