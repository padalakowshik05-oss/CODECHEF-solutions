# String with Number at End

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given string  **s**  that is appended with a number at last. The task is to check whether the length of string excluding that number is equal to that number.

 **Examples:** 

```
Input:  s = "geeks5"
Output: 1
Explanation: Length of geeks is 5 and the last number is also 5.
```

```
Input:  s = "geek5"
Output: 0
Explanation: Length of geek is 4 and the last number is 5.

```

 **Constraints:** 
1 <= |s| <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:30:54.136Z  

```java
class Solution {
    int isSame(String s) {

        int i = s.length() - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        int len = i + 1;
        String num = s.substring(i + 1);
        int start = 0;

        while (start < num.length() - 1 && num.charAt(start) == '0') {
            start++;
        }

        num = num.substring(start);
        if (num.length() > String.valueOf(len).length()) {
            return 0;
        }
        String lenString = String.valueOf(len);

        if (num.equals(lenString)) {
            return 1;
        }

        return 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-with-numbers-at-its-end5749/1)