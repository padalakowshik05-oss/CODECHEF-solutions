# For Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, print the first n positive even numbers in increasing order in a single line using a for loop.

 **Examples:** 

```
Input: n = 2
Output: 2 4
Explanation: The first 2 positive even numbers are 2 and 4.
```

```
Input: n = 6
Output: 2 4 6 8 10 12 
Explanation: The first 6 positive even numbers are 2, 4, 6, 8, 10 and 12.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T15:17:50.014Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i*2+" ");
        }
        

        sc.close();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-loops-set-11726/1)