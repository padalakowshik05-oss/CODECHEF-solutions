# Anagram Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, determine whether its characters can be rearranged to form a palindrome. Return  **true**  if it is possible to rearrange the string into a palindrome; otherwise, return  **false**.

 **Examples** 

```
Input: s = "baba"
Output: true
Explanation: Can be rearranged to form a palindrome "abba" 
```

```
Input: s = "geeksogeeks"
Output: true
Explanation: The characters of the string can be rearranged to form the palindrome "geeksoskeeg".

```

```
Input: s = "geeksforgeeks"
Output: false
Explanation: The given string can't be converted into a palindrome.

```

 **Constraints:** 
1 ≤ s.length ≤ 106
s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:47:46.182Z  

```java
class Solution {
    boolean canFormPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;

                for (int freq : map.values()) {
                    if (freq % 2 != 0) {
                        count++;
                    }
                }

                return count <= 1;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/anagram-palindrome4720/1)