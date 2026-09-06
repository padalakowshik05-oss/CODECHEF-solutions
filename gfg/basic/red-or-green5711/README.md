# Red OR Green

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s** of length  **n**, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.Find the minimum number of characters need to be changed so that the entire string becomes of the same colour.

 **Examples:** 

```
Input: s = "RGRGR"
Output: 2
Explanation: We need to change only the 2nd and 4th(1-index based) characters to 'R', so that the whole string becomes the same colour.
```

```
Input: s = "GGGGGGR"
Output: 1
Explanation: We need to change only the last character to 'G' to make the string same-coloured.
```

 **Constraints:** 
1 ≤ |s| ≤ 105
s consists only of characters 'R' and 'G'.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:38:03.502Z  

```java
class Solution {
    public int redOrGreen(String s) {
        int r=0;
        int g=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R'){
                r++;
            }
            else{
               g++; 
            }
        }
        if(r<g){
            return r;
        }
        else{
            return g;
        }
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/red-or-green5711/1)