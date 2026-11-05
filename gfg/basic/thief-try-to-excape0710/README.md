# Thief Trying to Escape

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

A thief trying to escape from jail has to cross  **n**  walls whose heights are given in  **arr[]**. In one jump, he can climb  **x**  feet, but due to the slippery nature of the walls, he slips back by  **y**  feet after every jump. Calculate the total number of jumps required to cross all walls and escape from the jail. After crossing a wall, the thief begins from ground level to cross the next wall.

 **Examples :** 

```
Input: arr[] = {11, 10, 10, 9}, x = 10, y = 1
Output: 5
Explanation: For wall 11, the thief crosses it in 2 jumps. For walls 10, 10, and 9, only 1 jump is needed for each wall. So, total jumps required = 2 + 1 + 1 + 1 = 5.
```

```
Input: arr[] = {25, 9}, x = 10, y = 2
Output: 4
Explanation: For wall 25, the thief crosses it in 3 jumps. For wall 9, only 1 jump is needed. So, total jumps required = 3 + 1 = 4.
```

**Constraints:
**1 ≤ n ≤ 105 
1 ≤ arr[i] ≤ 104 
1 ≤ y < x ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:50:29.974Z  

```java
class Solution {
    public int totalJumps(int[] arr, int x, int y) {
        int jumps = 0;

        for (int height : arr) {
            if (height <= x) {
                jumps++;
            } else {
                int remaining = height - x;
                jumps += 1 + (remaining + (x - y) - 1) / (x - y);
            }
        }

        return jumps;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/thief-try-to-excape0710/1)