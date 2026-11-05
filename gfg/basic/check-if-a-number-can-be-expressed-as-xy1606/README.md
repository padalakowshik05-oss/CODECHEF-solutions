# Check for Perfect Power Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer  **n**, determine whether it can be expressed in the form  **x^y**, where  **x**  and  **y**  are integers,  **x > 0**, and  **y > 1**.

Return  **true** if such integers x and y exist; otherwise, return  **false**.

 **Examples:** 

```
Input: n = 8
Output: true
Explanation: 8 can be expressed as 23.
```

```
Input: n = 7
Output: false 
Explanation: There do not exist integers x > 0 and y > 1 such that 7 = xy.
```

 **Constraints:** 
1 ≤ n ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:29:12.893Z  

```java
class Solution {
    public boolean checkPower(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;

        for (int x = 2; (long) x * x <= n; x++) {
            long val = (long) x * x;

            while (val <= n) {
                if (val == n) return true;
                val *= x;
            }
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-a-number-can-be-expressed-as-xy1606/1)