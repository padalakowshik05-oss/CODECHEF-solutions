# Count Pair Sum in 2 Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two sorted arrays  **a[]**  and  **b[]**  of distinct elements. Given a value  **x**. The problem is to count all pairs from both arrays whose sum equals  **x.** 

 **Note:**  The pair has an element from each array.

 **Examples:** 

```
Input: x = 10, a[] = [1, 3, 5, 7], b[] = [2, 3, 5, 8] 
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).  
```

```
Input: x = 5, a[] = [1, 2, 3, 4], b[] = [5, 6, 7, 8]
Output: 0
Explanation: There are no valid pairs.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T05:31:20.827Z  

```java
class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int a[], int b[], int x) {
        int count=0;
        int left=0;
        int right=b.length-1;
        while(left<a.length && right>=0){
            int sum=a[left]+b[right];
            if(sum==x){
                count++;
                left++;
                right--;
            }else if(sum<x){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pair-sum5956/1)