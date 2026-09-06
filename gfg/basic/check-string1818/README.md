# Check if All Characters Same

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string, check if all its characters are the same or not.

 **Examples:** 

```
Input: s = "geeks"
Output: false
Explanation: The string contains different character 'g', 'e', 'k' and 's'.

```

```
Input: s = "gggg"
Output: true
Explanation: The string contains only one character 'g'.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:18:28.067Z  

```java
class Solution {
    public boolean allCharactersSame(String s) {

        char first = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != first) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-string1818/1)