# Run Length Encoding

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, implement a function encode that performs run-length encoding on the string. Run-length encoding is a form of compression where consecutive occurrences of the same character are replaced by the character followed by the count of its occurrences.

 **Examples:** 

```
Input: s = aaaabbbccc
Output: a4b3c3
Explanation: The character 'a' repeated 4 times consecutively and 'b' 3 times, 'c' also 3 times, so answer for this test case is a4b3c3.

```

```
Input: s = abbbcdddd
Output: a1b3c1d4
Explanation:  The character 'a' is repeated 1 time, 'b' 3 times, 'c' 1 time and 'd' repeated 4 times, so answer for this test case is a1b3c1d4.
```

```
Input: s = g
Output: g1
```

 **Constraints:** 
1 ≤ s.size() ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T13:24:20.287Z  

```java
class Solution {
    public static String encode(String s) {
        StringBuilder ans = new StringBuilder();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i + 1 < s.length() && c == s.charAt(i + 1)) {
                count++;
            } else {
                ans.append(c);
                ans.append(count);
                count = 1;
            }
        }

        return ans.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/run-length-encoding/1)