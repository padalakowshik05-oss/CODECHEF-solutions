# Capitalize First Letter of Words

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, convert the first letter of each word in the string to uppercase. 

 **Examples:** 

```
Input: s = "gEEKs"
Output: "GEEKs"

```

```
Input: s = "i love programming"
Output: "I Love Programming"

```

 **Constraints:** 
1 <= s.length() <= 104
Consists of lowercase alphabets and spaces to separate words

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:13:07.854Z  

```java
class Solution {
    public String convert(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i == 0 || s.charAt(i - 1) == ' ') {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1)