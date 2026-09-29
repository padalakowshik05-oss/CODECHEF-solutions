# Ternary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

**Ternary search**  is a divide-and-conquer algorithm that divides the search range into three parts and identifies the part that may contain the target element. The process is repeated until the element is found or the search range becomes empty. 

Given a sorted array arr and an integer x, determine whether x is present in the array using ternary search.

 **Examples:** 

```
Input: arr = [1, 2, 3, 4, 6], x = 6
Output: true
Explanation: The element 6 is present in the array, so the output is true.
```

```
Input: arr = [1, 3, 4, 5, 6], x = 2
Output: false
Explanation: The element 2 is not present in the array, so the output is false.

```

**Constraints:
**1 ≤ arr.size() ≤ 106
1 ≤ x ≤ 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T17:12:10.404Z  

```java
class Solution {
    public boolean ternarySearch(int[] arr, int x) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m1=l+(h-l)/3;
            int m2=h-(h-l)/3;
            if(arr[m1]==x || arr[m2]==x){
                return true;
            }
            else if(x<arr[m1]){
                h=m1-1;
            }
            else if(x>arr[m2]){
                l=m2+1;
            }
            else{
                h=m2-1;
                l=m1+1;
            }
        }
        return false;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/searching-an-element-in-a-sorted-array-ternary-search--141631/1)