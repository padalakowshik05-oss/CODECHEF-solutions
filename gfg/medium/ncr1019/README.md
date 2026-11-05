# nCr

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **n** and  **r**, find the value of the binomial coefficient  **nCr** 

- A binomial coefficient nCr can be defined as the coefficient of xr in the expansion of (1 + x)n that gives the number of ways to choose r objects from a set of n objects without considering the order.
- The binomial coefficient nCr is calculated as : C(n,r) = n! / r! * (n-r) !

 **Note:**  If r is greater than n, return  **0**. It is guaranteed that the value of n **C** r will fit within a 32-bit integer.

 **Examples:** 

```
Input: n = 5, r = 2
Output: 10
Explaination: The value of 5C2 is calculated as 5! / ((5−2)!  *2!) = 5! / (3!*  2!) = 10.
```

```
Input: n = 2, r = 4
Output: 0
Explaination: Since r is greater than n, thus 2C4 = 0
```

```
Input: n = 5, r = 0
Output: 1
Explaination: The value of 5C0 is calculated as 5! / ((5−0)!  *0!) = 5! / (5!*  0!) = 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:38:28.517Z  

```java
class Solution {
    public int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }

        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }

        return (int) res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ncr1019/1)