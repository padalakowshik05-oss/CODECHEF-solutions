# Check for Bitonic with Same Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of non-negative integers, determine whether the array is perfect. An array is considered perfect if it first strictly increases, then remains constant, and finally strictly decreases. Any of these three parts can be empty.

### Examples:

```
Input: arr[] = [1, 8, 8, 8, 3, 2]
Output: true
Explanation: The array [1, 8, 8, 8, 3, 2] first increases in the range [0, 1], stays constant in the range [1, 3], and then decreases in the range [3, 4]. Thus, the array is perfect.
```

```
Input: arr[] = [1, 1, 2, 2, 1]
Output: false
Explanation: The array does not follow the required pattern of strictly increasing, constant, and then strictly decreasing.
```

 **Constraints** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:22:54.902Z  

```java
class Solution {
    public boolean isPerfect(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/perfect-array2344/1)