# Count Pairs Odd XOR

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**, determine the number of pairs (i, j) such that 0 ≤ i < j < arr.size() and the XOR of arr[i] and arr[j] is odd.

 **Examples:** 

```
Input: arr[] = [1, 2, 3]
Output: 2
Explanation: 
The possible pairs are:
(1, 2) -> 1 ^ 2 = 3 (odd)
(1, 3) -> 1 ^ 3 = 2 (even)
(2, 3) -> 2 ^ 3 = 1 (odd)
Hence, there are 2 pairs whose XOR is odd.
```

```
Input: arr[] = [1, 2]
Output: 1
Explanation: 
The only possible pair is:
(1, 2) -> 1 ^ 2 = 3 (odd)
Therefore, the number of pairs with odd XOR is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:33:36.989Z  

```java
class Solution {
    public int countXorPair(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return even * odd;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pairs-odd-xor0308/1)