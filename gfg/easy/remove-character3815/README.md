# Remove Characters Present in  Other

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1** and  **s2**, remove every character from s1 that is present in s2. Return the resulting string. Both strings contain only lowercase English letters, and |s1| > |s2|.

 **Examples:** 

```
Input: s1 = "computer", s2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t) from string1 we get "ompuer".
```

```
Input: s1 = "occurrence", s2  = "car"
Output: "ouene"
Explanation: After removing characters (c, a, r) from string1 we get "ouene".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T08:19:34.661Z  

```java
class Solution {
    public String removeChars(String s1, String s2) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(char c:s2.toCharArray()){
            set.add(c);
        }
        for(char c:s1.toCharArray()){
            if(set.contains(c)){
                continue;
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-character3815/1)