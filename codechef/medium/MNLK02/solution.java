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
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<n;i++){
		    set.add(s.charAt(i));
		}
		for(int i=0;i<n;i++){
		   if(set.contains(t.charAt(i))){
		       count++;
		   }
		   
		}
		if(count==n){
		   System.out.println("true"); 
		}
		else{
		   System.out.println("false"); 
		}
		
		
		

	}
}
