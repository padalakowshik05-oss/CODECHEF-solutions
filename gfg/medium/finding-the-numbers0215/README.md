# Two Unique Among Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing 2 *n + 2 positive numbers, out of which 2* n numbers exist in pairs whereas only two number occur exactly once and are distinct. Find the other two numbers. Return the answer in increasing order. 

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 2, 1, 4]
Output: [3, 4] 
Explanation: 3 and 4 occur exactly once.

```

```
Input: arr[] = [2, 1, 3, 2]
Output: [1, 3]
Explanation: 1 and 3 occur exactly once.

```

```
Input: arr[] = [2, 1, 3, 3]
Output: [1, 2]
Explanation: 1 and 2 occur exactly once.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T17:26:06.028Z  

```java
class Solution {
    public int[] singleNum(int[] arr) {
        int xor = 0;

        // XOR of all elements
        for (int num : arr) {
            xor ^= num;
        }

        // Find the rightmost set bit
        int bit = xor & (-xor);

        int a = 0;
        int b = 0;

        // Divide elements into two groups
        for (int num : arr) {
            if ((num & bit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        // Return in increasing order
        if (a < b) {
            return new int[]{a, b};
        }

        return new int[]{b, a};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1)