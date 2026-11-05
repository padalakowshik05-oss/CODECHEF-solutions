# Surface Area and Volume of Cuboid

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given length  **l**, width  **b**  and height  **h**  of a cuboid. Return an array containing the  **total surface area**  and  **volume**  of the cuboid.

 **Examples:** 

```
Input: l = 1, b = 2, h = 3
Output: [22, 6]
Explanation: Surface area = 2  *(2*  3 + 3  *1 + 1*  2) = 22 and volume = 1  *2*  3 = 6

```

```
Input: l = 2, b = 3, h = 5
Output: [62, 30]
Explanation: Surface area = 2  *(3*  5 + 5  *2 + 2*  3) = 62 and volume = 2  *3*  5 = 30
```

 **Constraints:** 
1 ≤ l, b, h ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T19:55:21.602Z  

```java
class Solution {
    public int[] find(int l, int b, int h) {
        int surfaceArea = 2 * (l * b + b * h + h * l);
        int volume = l * b * h;

        return new int[]{surfaceArea, volume};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid0522/1)