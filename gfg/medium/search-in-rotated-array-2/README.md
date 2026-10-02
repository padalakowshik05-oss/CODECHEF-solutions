# Search in Rotated Array 2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted and rotated array  **arr[]**  and a target  **key**. Check whether the key is present in the array or not.

 **Note:**  The array may contains duplicate elements.

 **Examples:** 

```
Input: arr[] = [3, 3, 3, 1, 2, 3], key = 3
Output: true
Explanation: 3 is present in the array.
```

```
Input: arr[] = [4, 5, 8, 1, 1, 1, 2], key = 6
Output: false
Explanation: 6 is not present in the array.
```

 **Constraints** :
1 ≤ arr.size() ≤ 106
0 ≤ arr[i], key ≤ 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T09:20:11.355Z  

```java
class Solution {
    public boolean search(int[] arr, int key) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==key){
                return true;
            }
            if (arr[l] == arr[m] && arr[m] == arr[h]) {
                            l++;
                            h--;
            }
            else if(arr[l]<=arr[m]){
                if(arr[l]<=key && key<arr[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(arr[m]<key && key<=arr[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return false;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1)