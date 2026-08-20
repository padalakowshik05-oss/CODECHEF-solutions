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
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    int cnt=0;
		    for(int i=l;i<=r;i++){
		        int d=i%10;
		        if(d==2 || d==3 || d==9){
		            cnt++;
		        }
		    }
		    System.out.println(cnt);
		}

	}
}