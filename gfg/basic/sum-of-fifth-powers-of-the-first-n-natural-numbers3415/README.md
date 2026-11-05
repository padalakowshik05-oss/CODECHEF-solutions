# Sum of fifth powers of the first n natural numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer n, find the sum of the fifth powers of the first n natural numbers.

 **Examples:** 

```
Input: n = 2
Output: 33
Explanation: The sum is calculated as 15+25=1+32=33.
```

```
Input: n = 3
Output: 276
Explanation: The sum is calculated as 15+25+35=1+32+243=276.
```

 **Constraints:** 
1 ≤ n ≤ 17

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:01:19.325Z  

```java
class Solution {
    public int sumOfFifthPowers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (int) Math.pow(i, 5);
        }

        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-fifth-powers-of-the-first-n-natural-numbers3415/1)