# Maximum Picks Before Repetition

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a set of numbers from 1 to n, each number is exactly present twice, so there are n pairs. In the worst-case scenario, how many numbers should be picked and removed from the set until we find a repeating element (or an element picked again)?

 **Examples:** 

```
Input: n = 3
Output: 4
Explanation: There are 3 pairs, In the worst case, an arrangement like {1, 2, 3, 1, 2, 3} would require 4 picks.
```

```
Input: n = 1
Output: 2
Explanation: There is one pair and a repeating element would appear in 2 picks.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:51:56.611Z  

```java
class Solution {
    static int find(int n) {
        return n + 1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/matching-pair5320/1)