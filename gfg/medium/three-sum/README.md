# Three Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr**, return all the  **unique** triplets [arr[i], arr[j], arr[k]] such that **i != j, i != k, and j != k,** and  **arr[i] + arr[j] + arr[k] == 0.** 

Note: The triplets must be returned in  **sorted** order, the solution vector should also be  **sorted**, and the answer must not contain any  **duplicate** triplets.

 **Examples:** 

```
Input: arr = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: arr[0] + arr[1] + arr[2] = (-1) + 0 + 1 = 0.
arr[1] + arr[2] + arr[4] = 0 + 1 + (-1) = 0.
arr[0] + arr[3] + arr[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].

```

```
Input: arr = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
```

**Constraints:
**3 <= arr.length <= 3000
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T17:18:22.393Z  

```java
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);

                    ans.add(temp);

                    while (left < right && arr[left] == arr[left + 1])
                        left++;

                    while (left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-sum/1)