# Find Rotation Count

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an increasing sorted rotated array  **arr[]** of distinct integers. The array is right-rotated  **k**  times. Find the value of  **k**.

 **Examples:** 

```
Input: arr[] = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is [5, 1, 2, 3, 4]. The original sorted array is [1, 2, 3, 4, 5]. We can see that the array was rotated 1 times to the right.

```

```
Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated.
```

```
Input: arr = [6, 9, 2, 4]
Output: 2
Explanation: The original array is [2, 4, 6, 9] and we get the above array after two rotations.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T11:33:16.590Z  

```java
class Solution {
    public int findKRotation(int arr[]) {
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
        return l;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotation4723/1)