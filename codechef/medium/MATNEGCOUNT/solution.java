import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[n][m];
		int count=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        a[i][j]=sc.nextInt();
		        if(a[i][j]<0){
		            count++;
		        }
		    }
		}
		System.out.println(count);

	}
}
