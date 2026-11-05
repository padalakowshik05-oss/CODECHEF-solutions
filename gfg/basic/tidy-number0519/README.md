# Tidy Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, check whether it is a tidy number. A number is called tidy if its digits are in non-decreasing order from left to right. 

 **Examples:** 

```
Input: n = 1234
Output: true
Explanation: The digits 1, 2, 3 and 4 are in non-decreasing order.
```

```
Input: n = 1243
Output: false
Explanation: Since 4 > 3, the digits are not in non-decreasing order.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:44:25.266Z  

```java
class Solution {
    public boolean isTidy(int n) {
        String s = String.valueOf(n);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/tidy-number0519/1)