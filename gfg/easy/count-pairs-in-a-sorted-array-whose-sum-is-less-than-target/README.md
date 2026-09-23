# Count Pairs in a sorted array whose sum is less than target

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and an integer  **target**. You have to find the number of pairs in the array whose sum is  **strictly less than**  the  **target**.

 **Examples:** 

```
Input: arr[] = [2, 3, 5, 7], target = 8
Output: 2
Explanation: The pairs are (2, 3) and (2, 5).
```

```
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], target = 7
Output: 6
Explanation: The pairs are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3) and (2, 4)
```

**Constraints:
**1 <= arr.size() <= 105
0 <= arr[i] <= 104
1 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T05:33:53.940Z  

```java
class Solution {
    int countPairs(int arr[], int target) {
        int left = 0;
                int right = arr.length - 1;
                int count = 0;

                while (left < right) {

                    if (arr[left] + arr[right] < target) {
                        count += right - left;
                        left++;
                    } else {
                        right--;
                    }
                }

                return count;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pairs-in-a-sorted-array-whose-sum-is-less-than-target/1)