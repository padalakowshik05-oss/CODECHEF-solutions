# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 23 ms (beats 5.83%)  
**Memory:** 44.4 MB (beats 74.60%)  
**Submitted:** 2026-09-03T15:28:03.088Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            map.put(ch1,map.getOrDefault(ch1,0)+1);
            map.put(ch2,map.getOrDefault(ch2,0)-1);
        }
        for(int count:map.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)