# Check if divisible by 36

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **s**  in the form of a string, check if it is divisible by 36.

 **Examples:** 

```
Input: s = "72"
Output: true
Explanation: The number 72 is divisible by 36.
```

```
Input: s = "7"
Output: false
Explanation: The number 7 is not divisible by 36.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:37:11.199Z  

```java
class Solution {
    public boolean checkDivisibleBy36(String s) {
        int sum = 0;
        int lastTwo = Integer.parseInt(s.substring(Math.max(0, s.length() - 2)));

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return sum % 9 == 0 && lastTwo % 4 == 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-divisible-by-363149/1)