# Sorted and Rotated Minimum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A sorted array of distinct elements  **arr[]**  is rotated at some unknown point, the task is to find the minimum element in it. 

 **Examples:** 

```
Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
```

```
Input: arr[] = [3, 1, 2]
Output: 1
Explanation: Here 1 is the minimum element.

```

```
Input: arr[] = [4, 2, 3]
Output: 2
Explanation: Here 2 is the minimum element.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T11:47:40.130Z  

```java
class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(arr[m]>arr[h]){
                l=m+1;
            }
            else{
                h=m;
            }
        }
        return arr[l];
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1)