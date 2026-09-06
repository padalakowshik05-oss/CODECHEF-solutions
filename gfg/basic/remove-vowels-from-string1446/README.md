# Remove Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**. Your task is to remove the vowels from the string.

 **Examples:** 

```
Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were returned in the same order.
```

```
Input: s = "what is your name ?"
Output: wht s yr nm ?

```

 **Constraints:** 
1 <= |s| <= 105
Alphabets are lower cases only

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:01:03.428Z  

```java
class Solution {
    String removeVowels(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1)