# Mighty Divisor

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given four integers  **a**,  **b**,  **c**  and  **n**, find the smallest n digit number that is divisible by all three numbers a, b, and c. If no such number exists, return -1.

 **Examples:** 

```
Input: a = 2, b = 3, c = 5, n = 2
Output: 30
Explanation: 30 is the smallest 2-digit number divisible by all three numbers.
```

```
Input: a = 3, b = 5, c = 7, n = 2
Output: -1
Explanation: There is no 2-digit number divisible by all three numbers.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T05:45:49.148Z  

```java
class Solution {
    public int minNumber(int a, int b, int c, int n) {
         long l = lcm(a, b);
        l = lcm(l, c);

        long start = 1;
        for (int i = 1; i < n; i++)
            start *= 10;

        long end = start * 10 - 1;

        long ans = ((start + l - 1) / l) * l;

        if (ans > end)
            return -1;

        return (int) ans;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-mighty-divisible-number22312231/1)