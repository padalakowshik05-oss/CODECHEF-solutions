# Nth of GP from First Two

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the first 2 terms  **a** and  **b** of a Geometric Series. The task is to find the **nth**  term of the series.

 **Examples:** 

```
Input: a = 2, b = 3, n = 1
Output: 2
Explanation: The first term is already given in the input as 2
```

```
Input: a = 1, b = 2, n = 5
Output: 16
Explanation: Common ratio = 2,Hence Fifth term is 1*(2)(5-1) = 24 = 16.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:42:04.692Z  

```java
class Solution {
    public int termOfGP(int a, int b, int n) {
        double r = (double) b / a;

        double ans = a * Math.pow(r, n - 1);

        return (int) Math.round(ans);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/gp-term/1)