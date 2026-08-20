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
		    int[] a =new int[n];
		    HashMap<Integer,Integer> mp=new HashMap<>();
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        mp.put(a[i],mp.getOrDefault(a[i],0)+1);
		    }
		    int max=0;
		    for(int value: mp.values()){
		        if(value>max){
		            max=value;
		        }
		    }
		    System.out.println(n-max);
		}

	}
}
