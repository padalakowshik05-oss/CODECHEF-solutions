# Digits in Factorial

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, find the number of digits in the value of  **n**  factorial. 

 **Examples :** 

```
Input: n = 5
Output: 3
Explanation: Factorial of 5 is 120. Number of digits in 120 is 3 (1, 2, and 0)
```

```
Input: n = 120
Output: 199
Explanation: The number of digits in 120! is 199
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:41:33.918Z  

```java
class Solution {
    public int digitsInFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        double sum = 0;

        for (int i = 2; i <= n; i++) {
            sum += Math.log10(i);
        }

        return (int) Math.floor(sum) + 1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/digits-in-factorial/1)