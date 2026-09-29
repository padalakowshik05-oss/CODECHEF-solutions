# Find Occurrences of an Element in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`, an integer array `queries`, and an integer `x`.

For each `queries[i]`, you need to find the index of the `queries[i]th` occurrence of `x` in the `nums` array. If there are fewer than `queries[i]` occurrences of `x`, the answer should be -1 for that query.

Return an integer array `answer` containing the answers to all queries.

 

 **Example 1:** 

 **Input:**  nums = [1,3,1,7], queries = [1,3,2,4], x = 1

 **Output:**  [0,-1,2,-1]

 **Explanation:** 

- For the 1st query, the first occurrence of 1 is at index 0.
- For the 2nd query, there are only two occurrences of 1 in nums, so the answer is -1.
- For the 3rd query, the second occurrence of 1 is at index 2.
- For the 4th query, there are only two occurrences of 1 in nums, so the answer is -1.

 **Example 2:** 

 **Input:**  nums = [1,2,3], queries = [10], x = 5

 **Output:**  [-1]

 **Explanation:** 

- For the 1st query, 5 doesn't exist in nums, so the answer is -1.

 

 **Constraints:** 

- 1 <= nums.length, queries.length <= 105
- 1 <= queries[i] <= 105
- 1 <= nums[i], x <= 104

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 92.64%)  
**Memory:** 160 MB (beats 91.14%)  
**Submitted:** 2026-09-29T16:45:28.945Z  

```java
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] positions = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                positions[count] = i;
                count++;
            }
        }

        int[] a = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];

            if (q <= count) {
                a[i] = positions[q - 1];
            } else {
                a[i] = -1;
            }
        }

        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/)