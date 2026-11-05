# Nth Even Fibonacci

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer n, find the nth Even Fibonacci number.

 **Example :** 

```
Input: n = 1
Output: 2 
Explanation: 2 is the first even number in the fibonacci series.

```

```
Input: n = 2
Output: 8
Explanation: 8 is the second even number in the fibonacci series.
```

 **Constraints:** 
1<= n <= 15

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:46:22.464Z  

```java
class Solution {
    static int nthEvenFibonacci(int n) {
        if (n == 1) return 2;
        if (n == 2) return 8;

        int prev = 2;
        int curr = 8;

        for (int i = 3; i <= n; i++) {
            int next = 4 * curr + prev;

            prev = curr;
            curr = next;
        }

        return curr;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/nth-even-fibonacci-number1119/1)