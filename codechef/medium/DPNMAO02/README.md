# DPNMAO02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Anagram Check

You are given two strings, $S$ and $T$. Your task is to determine if it's possible to rearrange the characters of $S$ to form the string $T$. In other words, you need to check if $T$ is an anagram of $S$.

 **NOTE:**  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Input Format
- The first line of input contains the string $S$.
- The second line of input contains the string $T$.
### Output Format
- Print True if $T$ can be formed by rearranging the characters of $S$, otherwise print False.
### Constraints
- $1\leq |S|, |T| \leq 1000$
- The strings consist of lowercase English letters only.
### Sample 1:
Input
Output

```
listen
silent
```

```
true
```

### Sample 2:
Input
Output

```
hello
world
```

```
false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:37:43.027Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO02)