# Smallest x and y for ax - by = 0

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two positive integers  **a**  and  **b**, representing the coefficients in the equation  **ax - by = 0**, find the smallest positive integers  **x**  and  **y**  that satisfy the equation.

 **Examples:** 

```
Input: a = 25, b = 35
Output: [7, 5]
Explanation: 25 *7 - 35* 5 = 0. And x = 7 and y = 5 are the least possible values of x and y to get the equation solved.
```

```
Input: a = 3, b = 7
Output: [7, 3]
Explanation: For this case x = 7 and y = 3 are the least values of x and y to satisfy the equation.
```

 **Constraints:** 
1 ≤ a, b ≤ 104
n = max(a, b)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T05:42:32.635Z  

```java
class Solution {
    ArrayList<Integer> findXY(int a, int b) {
         int g = gcd(a, b);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(b / g);
        ans.add(a / g);

        return ans;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-smallest-values-of-x-and-y-such-that-ax-by-01433/1)