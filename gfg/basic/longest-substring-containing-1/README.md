# Longest Substring with All 1's

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a binary string  **s**. Return the length of the longest substring containing only ‘1’.

 **Examples:** 

```
Input: s = "110"
Output: 2
Explanation: "11" is the longest substring containing only 1's. 
```

```
Input: s = "11101110"
Output: 3
Explanation: "111" is the longest substring containing only 1's.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:48:19.062Z  

```java
class Solution {
    public int longestSubstring(String s) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
            
        }
        return max;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-substring-containing-1/1)