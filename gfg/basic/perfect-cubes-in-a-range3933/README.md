# Perfect Cubes in a Range

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two given numbers  **a**  and  **b**  where 1 ≤  **a**  ≤  **b**, find the perfect cubes between a and b (a and b inclusive). The function returns  **-1**  if there is no proper cube between the given values.

 **Examples:** 

```
Input: a = 1, b = 100
Output: [1, 8, 27, 64]
Explanation: These are the proper cubes between 1 and 100.
```

```
Input: a = 24, b = 576
Output: [27, 64, 125, 216, 343, 512]
Explanation: These are the proper cubes between 24 and 576.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:45:08.098Z  

```java
class Solution {
    public ArrayList<Integer> properCubes(int a, int b) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i * i * i <= b; i++) {
            int cube = i * i * i;

            if (cube >= a) {
                ans.add(cube);
            }
        }

        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/perfect-cubes-in-a-range3933/1)