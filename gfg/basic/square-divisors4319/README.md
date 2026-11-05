# Square Divisors

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer  **n**, count the divisors of  **n** that are perfect squares.

A divisor d of n is considered valid if:

-  d divides n, and
-  d is a perfect square.

Return the count of such divisors.

 **Examples:** 

```
Input: 36
Output: 4
Explaination: The factors which are perfect square are 1, 4, 9 and 36.

```

```
Input: 60
Output: 2
Explaination: The factors which are perfect squares are 1 and 4.
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:43:59.195Z  

```java
class Solution {
    public int squareFactor(int n) {
        int count = 1;

        for (int i = 2; i * i <= n; i++) {
            int power = 0;

            while (n % i == 0) {
                power++;
                n /= i;
            }

            count *= (power / 2 + 1);
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/square-divisors4319/1)