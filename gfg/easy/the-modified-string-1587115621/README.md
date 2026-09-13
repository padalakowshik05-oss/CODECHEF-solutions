# The Modified String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, a string is considered valid if it does not contain three consecutive identical characters. You may insert characters at any position in the string.

Return the  **minimum**  number of insertions required to make s valid.

 **Examples:** 

```
Input: s = "aabbbcc"
Output: 1
Explanation: In "aabbbcc" 3 b's occur consecutively, we need to add a 'd', and Hence, the output will be "aabbdbcc".

```

```
Input: s = "aaaaa"
Output: 2
Explanation: In "aaaaa" 5 a's occur consecutively, we need to add 2 'b', and Hence, the output will be "aababaa".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T08:32:37.363Z  

```java
class Solution {
    public int modified(String s) {
        int ans = 0;
               int count = 1;

               for (int i = 1; i < s.length(); i++) {
                   if (s.charAt(i) == s.charAt(i - 1)) {
                       count++;

                       if (count == 3) {
                           ans++;
                           count = 1;
                       }
                   } else {
                       count = 1;
                   }
               }

               return ans;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-modified-string-1587115621/1)