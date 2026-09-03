import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(s.length()!=t.length()){
		    System.out.println("false");
		}
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++){
		    char ch1=s.charAt(i);
		    char ch2=t.charAt(i);
		    
		    map.put(ch1,map.getOrDefault(ch1,0)+1);
		    map.put(ch2,map.getOrDefault(ch2,0)-1);
		}
		for(int count:map.values()){
		    if(count!=0){
		        System.out.println("false");
		        break;
		    }
		}
		System.out.println("true");

	}
}
