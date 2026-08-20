/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    long[] bArr = new long[N];
		    
		    long sumB = 0, sumA = 0;
		    
		    for(int i=0; i<N; i++){
		        bArr[i] = sc.nextLong();
		        sumB += bArr[i];
		    }
		    sumA = sumB / (N+1);
		    for(int i=0; i<N; i++){
		        System.out.print((bArr[i] - sumA)+" ");
		    }
		    System.out.println();
		    T--;
		}
	}
}