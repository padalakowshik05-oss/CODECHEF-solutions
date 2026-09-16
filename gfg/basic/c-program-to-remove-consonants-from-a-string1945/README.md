# Remove Consonants

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, remove all consonants and return the modified string containing only vowels.

If the string does not contain any vowels, return an empty string.

 **Examples:** 

```
Input: s = "abEkipo"
Output: "aEio"
Explanation: a, E, i, o are only vowels in the string.

```

```
Input: s = "rrty"
Output: ""
Explanation: There are no vowels.

```

 **Constraints** 
1 ≤ n ≤ 105, n is length of the string
The string should consist of only alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:03:35.027Z  

```java
class Solution {
    String remConsonants(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!isVowel(c)){
                continue;
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
        
    }
    static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-program-to-remove-consonants-from-a-string1945/1)