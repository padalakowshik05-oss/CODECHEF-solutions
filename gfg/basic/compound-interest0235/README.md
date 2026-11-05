# Final Amount with Compound Interest

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given four integers  **p**,  **r**,  **t**, and  **n**  representing the principal amount, annual interest rate (in percentage), time period (in years), and the number of compounding periods per year respectively.

The final amount accumulated after  **t** years using the compound interest formula: 

Return the floor value of the accumulated amount A.

 **Examples:** 

```
Input: p = 1000, t = 2, n = 2, r = 10
Output: 1215
Explanation: After applying compound interest for 2 years at an annual rate of 10, compounded twice per year, the accumulated amount becomes 1215.50625. Taking its floor value gives 1215.
```

```
Input: p = 100, t = 1, n = 1, r = 10
Output: 110
Explanation: After applying compound interest for 1 year at an annual rate of 10, compounded once per year, the accumulated amount becomes 110.
```

 **Constraints:** 
1 ≤ p ≤ 1000
1 ≤ t ≤ 20
1 ≤ n ≤ 4
1 ≤ r ≤ 20

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:22:40.620Z  

```java
class Solution {
    static int calculateFutureValue(int p, int t, int n, int r) {
        return (int) (p * Math.pow(1 + (double) r / (100 * n), n * t));
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/compound-interest0235/1)