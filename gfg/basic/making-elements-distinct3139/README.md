# Make  Distinct Sorted with Minimum Sum Increments

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr**  of integers, make all elements distinct by only increasing their values while maintaining the sorted order. Find the minimum possible sum of the modified array.

 **Note:**  After increasing the values, the array must remain sorted.

 **Examples:** 

```
Input : arr = {2, 2, 3, 5, 6}
Output : 20
Explanation: We make the array as {2, 3, 4, 5, 6}. Sum becomes 2 + 3 + 4 + 5 + 6 = 20

```

```
Input : arr = {20, 20} 
Output :  41
Explanation : We make the array as [20, 21]. Sum becomes 20 + 21 = 41.
```

 **Constraints:** 
2 ≤ arr.size() ≤ 104
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T20:34:15.912Z  

```java
class Solution {
    public int minSum(ArrayList<Integer> arr) {
        Collections.sort(arr);

        int sum = 0;
        int prev = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num <= prev) {
                num = prev + 1;
            }

            sum += num;
            prev = num;
        }

        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/making-elements-distinct3139/1)