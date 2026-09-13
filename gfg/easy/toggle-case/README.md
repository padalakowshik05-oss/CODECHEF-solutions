# Toggle Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**,  **convert** the characters of the string into the  **opposite case**, i.e., if a character is lowercase, then convert it into uppercase and vice versa. 

 **Examples:** 

```
Input: s = "geeksForgEeks"
Output: GEEKSfORGeEKS
Explanation: The cases of the characters in "geeksForgEeks" are flipped.
```

```
Input: s = "helloEveryOne"
Output: HELLOeVERYoNE
Explanation: The cases of the characters in "helloEveryOne" are flipped.
```

**Constraints:
**1 ≤ s.length() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:09:35.494Z  

```java
class Solution {
    public String toggleCase(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                ans.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return ans.toString();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/toggle-case/1)