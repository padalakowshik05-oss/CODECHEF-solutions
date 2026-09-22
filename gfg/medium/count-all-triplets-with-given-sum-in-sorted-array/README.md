# Count all triplets with given sum in sorted array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]**  and a  **target**  value, the task is to count triplets  **(i, j, k)**  of valid indices, such that  **arr[i] + arr[j] + arr[k] = target**  and  **i < j < k**.

 **Examples:** 

```
Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
Output: 4
Explanation: Four triplets that add up to -2 are:
arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2
```

```
Input: arr[] = [-2, 0, 1, 1, 5], target = 1
Output: 0
Explanation: There is no triplet whose sum is equal to 1. 
```

**Constraints:
**3 ≤ arr.size() ≤ 104
-105 ≤ arr[i], target ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T17:44:55.556Z  

```java
class Solution {
    public int countTriplets(int[] arr, int target) {

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    if (arr[left] == arr[right]) {
                        int n = right - left + 1;
                        count += n * (n - 1) / 2;
                        break;
                    }

                    int leftValue = arr[left];
                    int rightValue = arr[right];

                    int leftCount = 0;
                    int rightCount = 0;

                    while (left <= right && arr[left] == leftValue) {
                        left++;
                        leftCount++;
                    }

                    while (right >= left && arr[right] == rightValue) {
                        right--;
                        rightCount++;
                    }

                    count += leftCount * rightCount;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-all-triplets-with-given-sum-in-sorted-array/1)