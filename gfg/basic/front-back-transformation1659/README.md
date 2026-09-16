# Front-Back Transformation  of String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s** consisting only of English alphabets, transform each character by replacing it with the character present at the corresponding position in the reversed English alphabet. Thus, 'a' becomes 'z', 'b' becomes 'y', 'c' becomes 'x', and similarly 'z' becomes 'a'. Uppercase letters are also transformed in the same way while preserving their case. Return the resulting transformed string.

 **Examples:** 

```
Input: s = "Hello"
Output: Svool
Explanation: 'H' is replaced by 'S', 'e' by 'v', 'l' by 'o', and 'o' by 'l'. Therefore, the transformed string becomes "Svool".
```

```
Input: s = "GfG"
Output: TuT
Explanation:'G' is replaced by 'T' and 'f' is replaced by 'u'. Hence, the resulting string is "TuT".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:16:52.862Z  

```java
class Solution {
    String transformString(String s) {
        StringBuilder ans = new StringBuilder();

                for (char c : s.toCharArray()) {
                    if (c >= 'a' && c <= 'z') {
                        ans.append((char) ('z' - (c - 'a')));
                    } else {
                        ans.append((char) ('Z' - (c - 'A')));
                    }
                }

                return ans.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/front-back-transformation1659/1)