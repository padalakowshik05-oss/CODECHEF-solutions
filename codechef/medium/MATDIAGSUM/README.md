# MATDIAGSUM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T14:21:27.992Z  

```java
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
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		for(int i=n-1;i>=0;i--){
		    for(int j=0;j<m;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATDIAGSUM)