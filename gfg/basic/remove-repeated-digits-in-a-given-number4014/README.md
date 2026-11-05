# Remove Repeated Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number n, remove consecutive repeated digits from it.

 **Examples:** 

```
Input: n = 1224
Output: 124
Explanation: Two consecutive occurrences of 2 have been reduced to one.

```

```
Input: n = 1242
Output: 1242
Explanation: No digit is repeating consecutively in n.

```

 **Constraints:** 
1<=n<=1018

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:50:05.152Z  

```java
class Solution {
    public long modify(long N) {
        String s = String.valueOf(N);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }

        return Long.parseLong(sb.toString());
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-repeated-digits-in-a-given-number4014/1)