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
		    int x=sc.nextInt();
		    String s=sc.next();
		    int countC=0;
		    int countN=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='C'){
		            countC+=2;
		        }
		        else if(s.charAt(i)=='N'){
		            countN+=2;
		        }
		        else{
		            countC+=1;
		            countN+=1;
		        }
		    }
		    if(countC>countN){
		        System.out.println(60*x);
		    }
		    else if(countC<countN){
		        System.out.println(40*x);
		    }
		    else{
		        System.out.println(55*x);
		    }
		}

	}
}
