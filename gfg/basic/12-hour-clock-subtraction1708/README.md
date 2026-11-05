# 12 Hour Clock Subtraction

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **x** and  **y**, subtract num2 from num1 on a 12-hour clock. Return the resulting hour in the range 0 to 11.

  **Note:**  Assume the clock is numbered from 0 to 11.

 **Examples:** 

```
Input: x = 7, y = 5
Output: 2
Explanation: 7 - 5 = 2, so the result on the 12-hour clock is 2.
```

```
Input: x = 5, y = 7
Output: 10
Explanation: 5 - 7 = -2. On a 12-hour clock, -2 corresponds to 10.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:25:03.468Z  

```java
class Solution {
    public int subClock(int x, int y) {
        return (x - y + 1200) % 12;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/12-hour-clock-subtraction1708/1)