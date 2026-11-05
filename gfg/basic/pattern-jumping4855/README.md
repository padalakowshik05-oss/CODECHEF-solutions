# Target with Jumps Equal to Positions

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, and a frog starts at position  **0**.

- In the first jump, it moves 1 unit forward.
- After that, if the frog is currently at position x, its next jump length is exactly x units.

Determine whether the frog can reach position n.

 **Examples :** 

```
Input: n = 3
Output: false
Explanation: The frog can't reach the position 3.
```

```
Input: n = 2
Output: true
Explanation: The frog jumps from position 0 to 1 in its first jump. Since it is now at position 1, its next jump length is 1, taking it to position 2. Therefore, the frog can reach position 2.
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:45:29.644Z  

```java
class Solution {
    public boolean canJump(int n) {
        return (n & (n - 1)) == 0;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pattern-jumping4855/1)