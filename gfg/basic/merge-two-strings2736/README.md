# Alternate Merge Two Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  **s1**  and  **s2**, merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.

 **Note:**  Add the whole string if other string is empty.

 **Examples:** 

```
Input: s1 = "Hello", s2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the given strings are arranged alternatlively.

```

```
Input: s1 = "abc", s2 = "def"
Output: adbecf
Explanation: The characters of both the given strings are arranged alternatlively.

```

 **Constraints:** 
1<=|s1|, |s2| <=103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T13:58:45.590Z  

```java
class Solution {
    String merge(String s1, String s2) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            ans.append(s1.charAt(i));
            ans.append(s2.charAt(j));
            i++;
            j++;
        }
        while(i<s1.length()){
            ans.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()){
            ans.append(s2.charAt(j));
                j++;
            }
        
        return ans.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-strings2736/1)