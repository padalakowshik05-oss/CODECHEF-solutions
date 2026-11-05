# Sum of product of x and y with floor(n/x) = y

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer  **n**, for every integer  **x**  such that 1 ≤ x ≤ n, define:

- y = ⌊n / x⌋

Find the sum of x * y for all  **valid**  pairs (x, y).

 **Examples :** 

```
Input: n = 5
Output: 21
Explanation: Following are the possible pairs of (x, y):
(1, 5), (2, 2), (3, 1), (4, 1), (5, 1).
So, 1 *5 + 2* 2 + 3 *1 + 4* 1 + 5*1 = 5 + 4 + 3 + 4 + 5 = 21.
```

```
Input: n = 10
Output: 87
Explanation: Sum of product of all possible pairs of (x, y) is 87.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:57:07.283Z  

```java
class Solution {
    public int sumofproduct(int n) {
        int sum = 0;

        for (int x = 1; x <= n; x++) {
            sum += x * (n / x);
        }

        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-product-of-x-and-y-with-floornx-y3711/1)