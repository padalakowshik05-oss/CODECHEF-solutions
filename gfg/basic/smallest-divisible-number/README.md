# Smallest Divisible by 1 to n

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number n, find an integer denoting the smallest number evenly divisible by each number from 1 to n.

 **Examples:** 

```
Input: n = 3
Output: 6
Explanation: 6 is the smallest number divisible by 1, 2 and 3.
```

```
Input: n = 6
Output: 60
Explanation: 60 is the smallest number divisible by all from 1 to 6.
```

 **Constraints:** 
1 ≤ n ≤ 25

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:34:05.322Z  

```java
class Solution {
    public static long getSmallestDivNum(int n) {
        long ans = 1;

        for (int i = 2; i <= n; i++) {
            ans = (ans * i) / gcd(ans, i);
        }

        return ans;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-divisible-number/1)