# Maximum Integer Value

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string s consisting of digits (**0–9**), insert either the ' **+** ' or '  *' operator between every pair of adjacent digits. The expression is evaluated strictly from left to right, and each digit must be used exactly once in the given order.

Determine the maximum possible value that can be obtained by choosing the operators optimally.

 **Examples :** 

```
Input: s = "01230"
Output: 9
Explanation: 
One optimal expression is: 0 + 1 + 2 * 3 + 0
Since the expression is evaluated strictly from left to right:
0 + 1 = 1
1 + 2 = 3
3 * 3 = 9
9 + 0 = 9
Hence, the maximum possible value is 9.
```

```
Input: s = "891"
Output: 73
Explanation:
One optimal expression is: 8 * 9 + 1
Evaluating from left to right:
8 * 9 = 72
72 + 1 = 73
Thus, the maximum possible value is 73.

```

 **Constraints:** 
1 ≤ |s| ≤ 9
s contains only digits from 0 to 9
Leading 0's maybe present.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:35:59.816Z  

```java
class Solution {
    public int maximumIntegerValue(String s) {
        int ans = s.charAt(0) - '0';

        for (int i = 1; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (ans <= 1 || digit <= 1) {
                ans += digit;
            } else {
                ans *= digit;
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-integer-value1434/1)