# Check if  Four Points Form a Square

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an 2D array points[][] which represents coordinates of four points in a plane. Find if the four points can form a square or not. Return true if they form a square else return false.

 **Examples :** 

```
Input: points[] = [[0, 0], [0, 1], [1, 0], [1, 1]]
Output: true
Explanation: These points form a square which can be clearly seen in the below image.

```

```
Input: points[] = [[0, 0], [1, 1], [1, 0], [0, 2]]
Output: false
Explanation: These four points do not form a square.

```

 **Constraints:** 
0 ≤ X-coordinate, Y-coordinate ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:46:01.798Z  

```java
class Solution {
    boolean isSquare(int points[][]) {
        long d[] = new long[6];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                long dx = points[i][0] - points[j][0];
                long dy = points[i][1] - points[j][1];

                d[k++] = dx * dx + dy * dy;
            }
        }

        Arrays.sort(d);

        if (d[0] == 0) {
            return false;
        }

        for (int i = 1; i < 4; i++) {
            if (d[i] != d[0]) {
                return false;
            }
        }

        return d[4] == d[5] && d[4] == 2 * d[0];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-given-four-points-form-a-square3026/1)