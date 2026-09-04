# Reverse String II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting from the start of the string.

If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than or equal to `k` characters, then reverse the first `k` characters and leave the other as original.

 

 **Example 1:** 

```
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

```

 **Example 2:** 

```
Input: s = "abcd", k = 2
Output: "bacd"

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of only lowercase English letters.
- 1 <= k <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.94%)  
**Memory:** 44.5 MB (beats 89.03%)  
**Submitted:** 2026-09-04T17:41:07.138Z  

```java
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int start = 0; start < arr.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1);

            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string-ii/)