# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 18.82%)  
**Memory:** 44.9 MB (beats 69.66%)  
**Submitted:** 2026-09-29T17:28:48.387Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int[] a=new int[n];
       int i=0;
       int j=0;
       int k=0;
       while(i<n && j<m){
        if(i>0 && nums1[i]==nums1[i-1]){
            i++;
            continue;
        }
        if(j>0 && nums2[j]==nums2[j-1]){
            j++;
            continue;
        }
        if(nums1[i]==nums2[j]){
            a[k]=nums1[i];
            k++;
            i++;
            j++;
        }
        else if(nums1[i]<nums2[j]){
            i++;
        }
        else{
            j++;
        }
       }
       return Arrays.copyOf(a, k);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)