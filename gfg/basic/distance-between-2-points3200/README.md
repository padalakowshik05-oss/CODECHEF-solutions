# Distance between 2 points

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given coordinates of  **2**  points as (x1, y1, x2 and y2) on a cartesian plane, find the distance between them and  **round** the result to the nearest integer.

 **Examples:** 

```
Input: 0 0 2 -2
Output: 3
Explanation: Distance between (0, 0) and (2, -2) is 3.

```

```
Input: -20 23 -15 68
Output: 45
Explanation: Distance between (-20, 23) and (-15, 68) is 45.

```

 **Constraints:** 
-1000 <= x1, y1, x2, y2 <= 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:21:52.462Z  

```java
class Solution {
    static int distance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(
            (x2 - x1) * (x2 - x1) +
            (y2 - y1) * (y2 - y1)
        );

        return (int) Math.round(dist);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distance-between-2-points3200/1)