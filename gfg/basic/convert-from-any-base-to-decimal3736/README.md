# Given Base to Decimal Conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **n**  and its base  **b**, convert it to decimal. The base of number can be anything such that all digits can be represented using 0 to 9 and A to Z. Value of A is 10, value of B is 11 and so on.

 **Examples:** 

```
Input: b = 2, n = "1100"
Output: 12
Explanation: It is a binary number whose decimal equivalent is 12.
```

```
Input: b = 16, n = "A"
Output: 10
Explanation: It's a hexadecimal number whose decimal equivalent is 10.
```

 **Constraints:** 
1 ≤ b ≤ 16
1 ≤ n ≤ decimal equivalent 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:37:34.810Z  

```java
class Solution {
    public int decimalEquivalent(String s, int b) {
        return Integer.parseInt(s, b);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-from-any-base-to-decimal3736/1)