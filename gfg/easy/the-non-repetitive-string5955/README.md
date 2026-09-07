# Non-Repetitive String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string **s**  consisting of uppercase English letters, determine whether it is a non-repetitive string. A string is called non-repetitive if every occurrence of the same character appears in a single contiguous block.

 **Examples:** 

```
Input: s = "AABBCCCCC"
Output: true
Explanation: Each character appears in a single contiguous block.

```

```
Input: s = "ABA"
Output: false
Explanation: The character 'A' appears again after a different character.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:43:29.773Z  

```java
class Solution {
    public boolean nonRepetitive(String s) {
        boolean[] seen = new boolean[26];

        char prev = '\0';

        for (char ch : s.toCharArray()) {

            if (ch != prev) {
                if (seen[ch - 'A']) {
                    return false;
                }

                seen[ch - 'A'] = true;
                prev = ch;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-non-repetitive-string5955/1)