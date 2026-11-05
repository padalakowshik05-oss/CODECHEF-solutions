# Check For Fibonacci

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer n, find if it is a Fibonacci Number. 

 **Examples :** 

```
Input: n = 34
Output: true
Explanation: 34 is one of the numbers of the Fibonacci series.
```

```
Input: n = 41
Output: false
Explanation: 41 is not in the numbers of the Fibonacci series.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:52:56.819Z  

```java
class Solution {
    public boolean isFibonacci(int n) {
        if (n < 0) return false;

        int a = 0, b = 1;

        while (a < n) {
            int c = a + b;
            a = b;
            b = c;
        }

        return a == n;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-the-number-is-fibonacci4654/1)