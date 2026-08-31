# nPr

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **r**, find the value of nPr, the number of ways to arrange r elements selected from n distinct elements. The value of nPr is given by: nPr = n! / (n − r)!, where ! denotes the factorial of a number.

 **Examples:** 

```
Input: n = 5, r = 2
Output: 20
Explaination: 5!/(5-2)! = 5!/3! = 120/6 = 20.
```

```
Input: n = 6, r = 3
Output: 120
Explaination: 6!/(6-3)! = 6!/3! = 720/6 = 120.
```

**Constraints:
**1 ≤ n ≤ 20
1 ≤ r ≤ n

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:09:49.741Z  

```java
class Solution {
    public long nPr(int n, int r) {
        long result = 1;

        for (long i = 0; i < r; i++) {
            result *= (n - i);
        }

        return result;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/npr4253/1)