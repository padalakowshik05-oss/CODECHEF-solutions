# Same Frequency in Two Halves

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, split it into two halves from the middle. If the length of s is odd, ignore the middle character before splitting.

 **Examples:** 

```
Input: s = "abcdbca"
Output: true
Explanation: The string has length 7 which is odd, hence we ignore the middle character 'd'. The frequency of 'a', 'b' and 'c' is same in both the halves.
```

```
Input: s = "abbaab"
Output: false
Explanation: The first half "abb" and the second half "aab" do not have the same character frequencies.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T14:34:59.214Z  

```java
class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();
                int half = n / 2;

                HashMap<Character, Integer> map1 = new HashMap<>();
                HashMap<Character, Integer> map2 = new HashMap<>();

                for (int i = 0; i < half; i++) {
                    char c = s.charAt(i);
                    map1.put(c, map1.getOrDefault(c, 0) + 1);
                }

                for (int i = n - half; i < n; i++) {
                    char c = s.charAt(i);
                    map2.put(c, map2.getOrDefault(c, 0) + 1);
                }

                return map1.equals(map2);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/riyas-test1450/1)