# Check Power of 3

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer  **n**, find if it is a power of  **3**. A number is said to be a power of  **3**  if it can be expressed as  for some non-negative integer  **x**.

 **Examples:** 

```
Input: n = 3
Output: true
Explanation: 3 = 31, so it is a power of 3.
```

```
Input: n = 1
Output: true
Explanation: 1 = 30, so it is a power of 3.
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:31:58.787Z  

```java
class Solution {
    static boolean isPowerOf3(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-a-integer-is-power-of-3-or-not3850/1)