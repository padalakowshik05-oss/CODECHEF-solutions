# Modulus of two double numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two floating-point numbers  **a**  and  **b**, compute the remainder when  **a**  is divided by  **b**.

Return the value of  **a % b**.

 **Examples:** 

```
Input: a = 36.5, b = 5.0
Output: 1.5
Explanation: The remainder when 36.5 is divided by 5.0 is 1.5.
```

```
Input: a = 9.7, b = 2.3
Output: 0.5
Explanation: The remainder when 9.7 is divided by 2.3 is 0.5.
```

 **Constraints:** 
1 ≤ a, b ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:47:10.432Z  

```java
class Solution {
    public double floatMod(double a, double b) {
        return a % b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/modulus-of-two-double-numbers5159/1)