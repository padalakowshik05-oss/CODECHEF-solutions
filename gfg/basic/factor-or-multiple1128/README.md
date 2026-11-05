# Bitwise OR of Multiples

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array   arr[]   comprising of n positive integers and an integer   x , find the bitwise OR of all multiples of x present in the array.

If no multiple of x is found, the answer should be 0.

 **Examples:** 

```
Input: arr[] = [3, 4, 3, 9], x = 2
Output: 4
Explanation: Only multiple of 2 in array is 4.
```

```
Input: arr[] = [9, 3, 1, 6, 1], x = 3
Output: 15
Explanation: Multiples of 3 in array are 9, 3 and 6. Their OR value is 15.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:45:47.625Z  

```java
class Solution {
    public int findOR(int[] arr, int x) {
        int result = 0;

        for (int num : arr) {
            if (num % x == 0) {
                result |= num;
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/factor-or-multiple1128/1)