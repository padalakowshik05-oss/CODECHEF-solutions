# Maximum Height of Staircase

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given  **n**  square blocks, where each block has a height of 1, construct a staircase of maximum possible height. The first step requires 1 block, the second step requires 2 blocks, the third step requires 3 blocks, and so on. Return the maximum height of the staircase that can be constructed using at most n blocks.

 **Examples:** 

```
Input: n = 10
Output: 4
Explanation: A staircase of height 4 requires: 1 + 2 + 3 + 4 = 10 blocks. Therefore, the maximum possible height is 4.
```

```
Input: n = 16
Output: 5
Explanation: A staircase of height 5 requires: 1 + 2 + 3 + 4 + 5 = 15 blocks. The remaining 1 block is not enough to create the next step, which requires 6 blocks. Therefore, the maximum possible height is 5.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:46:53.274Z  

```java
class Solution {
    public int maxHeight(int n) {
        int height = 0;
        int blocks = 0;

        for (int i = 1; ; i++) {
            blocks += i;

            if (blocks > n) {
                break;
            }

            height++;
        }

        return height;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-height-of-the-staircase5755/1)