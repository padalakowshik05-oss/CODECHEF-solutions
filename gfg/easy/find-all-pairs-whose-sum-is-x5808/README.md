# All Pairs with Sum from 2 Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two unsorted arrays  **a[]**   and b **[]**, the task is to find all pairs whose sum equals  **x**  from both arrays.

Note: All pairs should be returned in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be returned first else second.

 **Examples:** 

```
Input: target = 9, a[] = [1, 2, 4, 5, 7], b[] = [5, 6, 3, 4, 8]
Output: 
1 8
4 5 
5 4
Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.

```

```
Input: target = 8, a[] = [-1, -2, 4, -6, 5, 7], b[] = [6, 3, 4, 0]
Output:
4 4 
5 3

```

```
Input: target = 9, a[] = [1, 2, 4, 5, 7, 4], b[] = [5, 6, 3, 4, 8, 4]
Output:
1 8
4 5
4 5
5 4
5 4
Explanation: (1, 8), (4, 5), (4, 5), (5, 4) and (5, 4) are the pairs which sum to 9.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T05:26:56.399Z  

```java
class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<pair> list = new ArrayList<>();

        int left = 0;
        int right = arr2.length - 1;

        while (left < arr1.length && right >= 0) {

            int sum = arr1[left] + arr2[right];

            if (sum == target) {

                int x = arr1[left];
                int y = arr2[right];

                int count1 = 0;
                while (left < arr1.length && arr1[left] == x) {
                    count1++;
                    left++;
                }

                int count2 = 0;
                while (right >= 0 && arr2[right] == y) {
                    count2++;
                    right--;
                }

                // Add all combinations
                for (int i = 0; i < count1 * count2; i++) {
                    list.add(new pair(x, y));
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return list.toArray(new pair[0]);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1)