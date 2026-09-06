# Delete alternate characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  as input. Delete the characters at odd indices of the string. Return the final string after deletion of characters at odd indices.

 **Examples :** 

```
Input: s = "Geeks"
Output: "Ges" 
Explanation: Deleted "e" at index 1 and "k" at index 3.

```

```
Input: s = "GeeksforGeeks"
Output: "GesoGes"
Explanation: Deleted e, k, f, r, e, k at index 1, 3, 5, 7, 9, 11.
```

 **Constraints:** 
1<= s.size() <=1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:15:07.906Z  

```java
class Solution {
    static String delAlternate(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            ans.append(s.charAt(i));
        }
        return ans.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1)