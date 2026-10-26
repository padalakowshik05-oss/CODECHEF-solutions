import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int l=k;
		
		
		for(int i=n;i>=1;i--){
		    if(n % i == 0){
		        l--;
		        if(l == 0){
		            System.out.println(i);
		            return;
		        }
		       
		    }
		    
		    
		}
		System.out.println(1);
		

	}
}
